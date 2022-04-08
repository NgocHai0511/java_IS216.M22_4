CREATE TABLE TAU (
maTau char(5) NOT NULL,
tenTau varchar2(30),
loaiTau varchar2(15) ,
CONSTRAINT tau_pk PRIMARY KEY (maTau)
)
/
CREATE TABLE GHE (
maGhe char(4) NOT NULL,
tenloaiGhe varchar2(30) CHECK (tenloaiGhe='ngoi cung' or tenloaiGhe='giuong nam' or tenloaiGhe='giuong nam dieu hoa'),
maToa char(4),
CONSTRAINT ghe_pk PRIMARY KEY (maGhe)
)
/
CREATE TABLE KHACHHANG (
maKH char(4) NOT NULL,
tenKH varchar2(30),
sodt varchar(20),
diachi varchar2 (50),
CONSTRAINT khachang_pk PRIMARY KEY (maKH)
)
/
CREATE TABLE LICHTRINH (
maLichTrinh char(5)NOT NULL,
maTau char(5),
gaDi varchar2(20),
gaDen varchar(20),
tgianchay Date,
CONSTRAINT lichtrinh_pk PRIMARY KEY (maLichTrinh)
)
/
CREATE TABLE TOA (
maToa char(4) NOT NULL,
tenToa varchar2(30),
loaiToa varchar2(15) CHECK (loaitoa='toa dau' or loaitoa='toa giua' or loaitoa='toa cuoi'),
maTau char(5),
CONSTRAINT toa_pk PRIMARY KEY (maToa)
)
/
 
/
CREATE TABLE VETAU (
maVe char(5) NOT NULL,
ngayban Date,
maLichTrinh char(5),
maTau char(5),
maToa char(4),
maGhe char(4),
maKH char(4),
giaVe NUMBER(6),
CONSTRAINT ve_pk PRIMARY KEY (maVe)
)
/
alter table LICHTRINH add constraint fk_matau FOREIGN KEY (maTau) REFERENCES TAU (maTau);
alter table VETAU add constraint fk_lichtrinh FOREIGN KEY (maLichTrinh) REFERENCES LICHTRINH (maLichTrinh);
alter table VETAU add constraint fk_matau_2 FOREIGN KEY (maTau) REFERENCES TAU (maTau);
alter table VETAU add constraint fk_matoa FOREIGN KEY (maToa) REFERENCES TOA (maToa);
alter table VETAU add constraint fk_ghe FOREIGN KEY (maGhe) REFERENCES GHE (maGhe);
alter table VETAU add constraint fk_makh FOREIGN KEY (maKH) REFERENCES KHACHHANG (maKH);
alter table TOA add constraint fk_matau_3 FOREIGN KEY (maTau) REFERENCES TAU (maTau);
alter table GHE add constraint fk_matoa_2 FOREIGN KEY (maToa) REFERENCES TOA (maToa);



alter table TOA add constraint c_loaitoa check (loaitoa='toa dau' or loaitoa='toa giua' or loaitoa='toa cuoi');
alter table GHE add constraint c_loait CHECK (tenloaiGhe='ngoi cung' or tenloaiGhe='giuong nam' or tenloaiGhe='giuong nam dieu hoa');

insert INTO KHACHHANG(makh,tenKH,sodt,diachi) VALUES ('KH01','NGUYEN VAN A','0123456789','BINH DINH');
insert INTO KHACHHANG(makh,tenKH,sodt,diachi) VALUES ('KH02','NGUYEN VAN B','7373626262','CA MAU');
insert INTO KHACHHANG(makh,tenKH,sodt,diachi) VALUES ('KH03','NGUYEN VAN C','0984563533','HA NOI');

--ham tinh so luong ve da dat cua mot khach hang.
CREATE OR REPLACE FUNCTION sl_ve (ma_kh khachhang.makh%TYPE) RETURN NUMBER
AS
    tong_ve NUMBER(6);
BEGIN
    SELECT count(MAVE) INTO tong_ve
    FROM VETAU
    WHERE MAKH=ma_kh;
    RETURN tong_ve;
END;


--so ve con lai cua mot lich trinh
CREATE OR REPLACE FUNCTION soveconlai_1lt (ma_lt LICHTRINH.malichtrinh%type) RETURN NUMBER
AS
    so_ve_con_lai NUMBER(2);
BEGIN
    SELECT COUNT(MAVE) INTO so_ve_con_lai
    FROM VETAU
    WHERE malichtrinh = ma_lt and maKH is NULL;
    RETURN so_ve_con_lai;
END;


--so ve da ban trong thoi gian nao do.
CREATE OR REPLACE PROCEDURE slve_ban (thang int, nam int)
AS
    tong_ve NUMBER(6);
BEGIN
    SELECT COUNT(MAVE) INTO tong_ve
    FROM vetau
    WHERE EXTRACT (YEAR FROM NGAYBAN)=nam and EXTRACT (MONTH FROM NGAYBAN)=thang;
    dbms_output.put_line('so ve da ban trong '+thang+'/'+nam+' la: '+tong_ve);
    EXCEPTION
    when no_data_found then 
            DBMS_OUTPUT.PUT_LINE('Khong co ve nao ban trong thoi gian nay!');
END;


--ham dat ve cho mot khach hang
create or replace PROCEDURE datve(maKH_dat KHACHHANG.MAKH%TYPE, maLT_dat VETAU.MALICHTRINH%type, toa_dat VETAU.MATOA%TYPE,ghe_dat VETAU.MAGHE%type)
AS
khach_vitridat  VETAU.MAKH%TYPE;
begin
    select v.makh INTO khach_vitridat 
    from VETAU v
    where maLT_dat = v.MALICHTRINH AND  toa_dat = v.MATOA AND ghe_dat = v.MAGHE;
    if(khach_vitridat is NULL) then
        update vetau 
        set makh= maKH_dat 
        where maLT_dat = MALICHTRINH AND  toa_dat = MATOA AND ghe_dat = MAGHE;
                dbms_output.put_line('Dat ve thanh cong! ');

    else 
        dbms_output.put_line('Vi tri nay da duoc nguoi khac dat! ');
    end if;
    
end;


--trigger kiem tra so ve khong vuot qua 30
CREATE OR REPLACE TRIGGER ve_lichtrinh
BEFORE INSERT OR UPDATE ON VETAU 
FOR EACH ROW
DECLARE 
    slve_lt NUMBER(3);
    ma_lt LICHTRINH.malichtrinh%type := :NEW.malichtrinh;
BEGIN
    SELECT COUNT(MAVE) INTO slve_lt
    FROM VETAU
    WHERE malichtrinh = ma_lt
    GROUP BY malichtrinh;
    IF (slve_lt + 1 > 30 ) THEN
        DBMS_OUTPUT.PUT_LINE('so luong ve khong duoc lon hon 30!');
        ROLLBACK;
    END IF;
END;
CREATE DATABASE QuanLyTourDuLich;
GO

USE QuanLyTourDuLich;
GO

-- Bảng DiaDiem
CREATE TABLE DiaDiem (
    MaDiaDiem INT PRIMARY KEY IDENTITY(1,1),
    TenDiaDiem NVARCHAR(255),
    MoTa NVARCHAR(255),
    ToaDo VARCHAR(255) ,
    ThanhPho NVARCHAR(50) ,
    Tinh NVARCHAR(50) 
);
GO

-- Bảng Tour
CREATE TABLE Tour (
    MaTour INT PRIMARY KEY IDENTITY(1,1),
    TenTour NVARCHAR(255), 
    MoTa NVARCHAR(255) , 
    SoNgay INT NOT NULL,
    MaDiaDiem INT NOT NULL,
    FOREIGN KEY (MaDiaDiem) REFERENCES DiaDiem(MaDiaDiem)
);
GO

-- Bảng LichTrinhTour
CREATE TABLE LichTrinhTour (
    MaTour INT NOT NULL,
    MaDiaDiem INT NOT NULL,
    ThuTuThamQuan INT NOT NULL,
    ThuTuNgay INT NOT NULL,
    ThoiGianDen TIME NOT NULL,
    ThoiGianRoiDi TIME NOT NULL,
    MoTa NVARCHAR(255),
    PRIMARY KEY (MaTour, ThuTuThamQuan),
    FOREIGN KEY (MaTour) REFERENCES Tour(MaTour),
    FOREIGN KEY (MaDiaDiem) REFERENCES DiaDiem(MaDiaDiem)
);
GO

-- Bảng HuongDanVien
CREATE TABLE HuongDanVien (
    MaHDV INT PRIMARY KEY IDENTITY(1,1),
    TenHDV NVARCHAR(255),
    SoDienThoai NVARCHAR(15) NOT NULL
);
GO

-- Bảng Tour_Turn
CREATE TABLE Tour_Turn (
    MaTour INT NOT NULL,
    Turn INT NOT NULL,
    MaHDV INT NOT NULL,
    SoLuongKhachToiThieu INT,
    SoLuongKhachToiDa INT,
    SoLuongKhachDaDat INT DEFAULT 0,
    TrangThai NVARCHAR(50)DEFAULT N'Đang chờ',
    ThoiGianChot DATETIME NOT NULL,
    ThoiGianKhoiHanh DATETIME NOT NULL,
    ThoiGianKetThuc DATETIME NOT NULL,
    GiaTour DECIMAL(18, 2) NOT NULL,
    DoanhThu DECIMAL(18, 2) DEFAULT 0,
    PRIMARY KEY (MaTour, Turn),
    FOREIGN KEY (MaTour) REFERENCES Tour(MaTour),
    FOREIGN KEY (MaHDV) REFERENCES HuongDanVien(MaHDV)
);
GO

-- Bảng NguoiDung
CREATE TABLE NguoiDung (
    MaNguoiDung INT PRIMARY KEY IDENTITY(1,1),
    TenDangNhap VARCHAR(255) UNIQUE NOT NULL,
    MatKhau VARCHAR(255) NOT NULL,
    HoTen NVARCHAR(255),
    Email VARCHAR(255) UNIQUE NOT NULL,
    SoDienThoai VARCHAR(15) NOT NULL,
    DiaChi NVARCHAR(255),
    VaiTro INT NOT NULL,  -- 1: Quản lý, 2: Nhân viên
    NgayTaoTK DATETIME NOT NULL
);
GO

-- Bảng DatTour
CREATE TABLE DatTour (
    MaDatTour INT PRIMARY KEY IDENTITY(1,1),
    MaNguoiDung INT NOT NULL,
    MaTour INT NOT NULL,
    Turn INT NOT NULL,
    NgayDat DATE NOT NULL,
    SoLuongKhach INT NOT NULL,
    TongTien DECIMAL(18, 2) NOT NULL,
    TrangThai NVARCHAR(50) ,
    ThongBao NVARCHAR(255),
    FOREIGN KEY (MaNguoiDung) REFERENCES NguoiDung(MaNguoiDung),
    FOREIGN KEY (MaTour,Turn) REFERENCES Tour_Turn(MaTour,Turn)
);
GO
alter table DatTour alter column TrangThai Nvarchar(100)
-- Tạo index

-- Bảng DiaDiem

CREATE INDEX IX_DiaDiem_TenDiaDiem ON DiaDiem (TenDiaDiem);

CREATE INDEX IX_DiaDiem_ThanhPho ON DiaDiem (ThanhPho);

CREATE INDEX IX_DiaDiem_Tinh ON DiaDiem (Tinh);



-- Bảng Tour_Turn

CREATE INDEX IX_TourTurn_MaHDV ON Tour_Turn (MaHDV);

CREATE INDEX IX_TourTurn_ThoiGianKhoiHanh ON Tour_Turn (ThoiGianKhoiHanh);

CREATE INDEX IX_TourTurn_ThoiGianChot ON Tour_Turn (ThoiGianChot);



-- Bảng NguoiDung

CREATE INDEX IX_NguoiDung_SoDienThoai ON NguoiDung (SoDienThoai);



-- Bảng DatTour

CREATE INDEX IX_DatTour_MaNguoiDung ON DatTour (MaNguoiDung);

CREATE INDEX IX_DatTour_MaTour_Turn ON DatTour (MaTour, Turn);

CREATE INDEX IX_DatTour_NgayDat ON DatTour (NgayDat);
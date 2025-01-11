USE QuanLyTourDuLich;
GO

-- Chèn dữ liệu vào bảng NguoiDung
INSERT INTO NguoiDung (TenDangNhap, MatKhau, HoTen, Email, SoDienThoai, DiaChi, VaiTro, NgayTaoTK) VALUES
('admin', 'admin123', N'Nguyễn Văn An', 'admin@example.com', '0987654321', N'123 đường ABC', 1, GETDATE()),
('nhanvien1', 'nv123', N'Trần Thị Bình', 'nhanvien1@example.com', '0912345678', N'456 đường XYZ', 2, GETDATE());

-- Chèn dữ liệu vào bảng DiaDiem
INSERT INTO DiaDiem (TenDiaDiem, MoTa, ToaDo, ThanhPho, Tinh) VALUES
(N'Bảo tàng Thành phố Hồ Chí Minh', N'Lưu giữ nhiều cổ vật, hiện vật và bằng chứng lịch sử gắn liền với quá trình dựng nước và giữ nước của Việt Nam.', '[106.6993, 10.7772]', N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Lịch sử Việt Nam', N'Trưng bày hơn 40.000 hiện vật quý giá, phản ánh sự hình thành và phát triển văn hóa, lịch sử Việt Nam qua các thời kỳ.', '[106.7022, 10.7847]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Chứng tích Chiến tranh', N'Trưng bày các hiện vật, hình ảnh về chiến tranh Việt Nam, nhằm giáo dục về giá trị của hòa bình.', '[106.6928, 10.7798]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Phụ nữ Nam Bộ', N'Giới thiệu về lịch sử, văn hóa và đóng góp của phụ nữ Nam Bộ trong các giai đoạn lịch sử.', '[106.6843, 10.7874]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Chiến dịch Hồ Chí Minh', N'Trưng bày các hiện vật liên quan đến Chiến dịch Hồ Chí Minh lịch sử năm 1975.', '[106.7008, 10.7793]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Lực lượng vũ trang miền Đông Nam Bộ', N'Trưng bày các hiện vật về lịch sử chiến đấu của lực lượng vũ trang miền Đông Nam Bộ.', '[106.6629, 10.7987]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Dinh Độc Lập', N'Di tích lịch sử, nơi chứng kiến nhiều sự kiện quan trọng của Việt Nam, đặc biệt là sự kiện 30/4/1975.', '[106.6954, 10.7763]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng tranh 3D Artinus', N'Bảo tàng nghệ thuật 3D với nhiều bức tranh sống động, cho phép du khách tương tác và chụp ảnh.', '[106.7031, 10.7323]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'The Factory Contemporary Arts Centre', N'Trung tâm nghệ thuật đương đại, trưng bày các tác phẩm nghệ thuật hiện đại và tổ chức các sự kiện văn hóa.', '[106.7349, 10.8083]',  N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Mỹ thuật Thành phố Hồ Chí Minh', N'Trưng bày các tác phẩm mỹ thuật từ cổ điển đến hiện đại của Việt Nam và quốc tế.', '[106.6973, 10.7714]', N'Hồ Chí Minh', N'Hồ Chí Minh'),
(N'Bảo tàng Áo dài', N'Giới thiệu về lịch sử và sự phát triển của áo dài Việt Nam qua các thời kỳ.', '[106.7985, 10.8537]',  N'Hồ Chí Minh', N'Hồ Chí Minh');

-- Chèn dữ liệu vào bảng Tour
INSERT INTO Tour (TenTour, MoTa, SoNgay, MaDiaDiem) VALUES
(N'Tour tham quan bảo tàng 1 ngày', N'Khám lịch sử và văn hóa Việt Nam qua các bảo tàng nổi tiếng.', 1, 1),
(N'Tour tham quan Sài Gòn 1 ngày', N'Tham quan các địa danh nổi tiếng tại Tp.HCM.', 1, 7); -- Địa điểm khởi hành: Dinh Độc Lập

-- Chèn dữ liệu vào bảng LichTrinhTour
-- Lịch trình cho Tour tham quan bảo tàng 1 ngày
INSERT INTO LichTrinhTour (MaTour, MaDiaDiem, ThuTuThamQuan, ThuTuNgay, ThoiGianDen, ThoiGianRoiDi, MoTa) VALUES
(1, 1, 1, 1, '07:30:00', '08:15:00', N'Khám phá lịch sử hình thành và phát triển TP.HCM'),
(1, 3, 2, 1, '08:20:00', '09:10:00', N'Tìm hiểu hiện vật, hình ảnh về chiến tranh Việt Nam'),
(1, 4, 3, 1, '09:15:00', '10:00:00', N'Tìm hiểu về vai trò của phụ nữ Nam Bộ trong lịch sử'),
(1, 10, 4, 1, '10:10:00', '10:50:00', N'Ngắm các tác phẩm mỹ thuật từ cổ điển đến hiện đại'),
(1, 7, 5, 1, '11:00:00', '11:30:00', N'Tham quan di tích lịch sử nổi tiếng'),
(1, 2, 6, 1, '12:45:00', '13:30:00', N'Tìm hiểu hơn 40.000 hiện vật về lịch sử Việt Nam'),
(1, 6, 7, 1, '13:40:00', '14:20:00', N'Tìm hiểu lịch sử chiến đấu của lực lượng vũ trang'),
(1, 5, 8, 1, '14:40:00', '15:30:00', N'Tham quan hiện vật về chiến dịch Hồ Chí Minh lịch sử'),
(1, 9, 9, 1, '15:45:00', '16:30:00', N'Chiêm ngưỡng các tác phẩm nghệ thuật đương đại'),
(1, 11, 10, 1, '16:50:00', '18:00:00', N'Khám phá lịch sử và vẻ đẹp của áo dài Việt Nam');

-- Lịch trình cho Tour tham quan Sài Gòn 1 ngày
INSERT INTO LichTrinhTour (MaTour, MaDiaDiem, ThuTuThamQuan, ThuTuNgay, ThoiGianDen, ThoiGianRoiDi, MoTa) VALUES
(2, 7, 1, 1, '07:30:00', '08:30:00', N'Tham quan Dinh Độc Lập'),
(2, 3, 2, 1, '08:45:00', '09:30:00', N'Tham quan Nhà thờ Đức Bà và Bưu điện Trung tâm Sài Gòn'),
(2, 9, 3, 1, '09:45:00', '10:30:00', N'Dạo quanh Phố đi bộ Nguyễn Huệ'),
(2, 10, 4, 1, '10:45:00', '11:30:00', N'Tham quan Chợ Bến Thành'),
(2, 6, 5, 1, '13:00:00', '14:00:00', N'Tham quan Bến Cảng Nhà Rồng'),
(2, 11, 6, 1, '14:30:00', '16:00:00', N'Tham quan Công viên Grand Park ở Quận 9, thư giãn và tận hưởng không gian xanh mát'),
(2, 8, 7, 1, '17:00:00', '18:30:00', N'Tham quan và ngắm cảnh tại Landmark 81, trải nghiệm ngắm nhìn TP.HCM từ trên cao');

-- Chèn dữ liệu vào bảng HuongDanVien
INSERT INTO HuongDanVien (TenHDV, SoDienThoai) VALUES
(N'Lê Thị C', '0901234567'),
(N'Phạm Văn D', '0987650987');

-- Chèn dữ liệu vào bảng Tour_Turn
INSERT INTO Tour_Turn (MaTour, Turn, MaHDV, SoLuongKhachToiThieu, SoLuongKhachToiDa, SoLuongKhachDaDat, ThoiGianChot, ThoiGianKhoiHanh, ThoiGianKetThuc, GiaTour) VALUES
(1, 1, 1, 10, 20, 2, '2024-12-28', '2024-12-30', '2024-12-30', 500000),
(2, 1, 2, 10, 30, 5, '2024-12-29', '2024-12-31', '2024-12-31', 300000);

-- Chèn dữ liệu vào bảng DatTour
INSERT INTO DatTour (MaNguoiDung, MaTour, Turn, NgayDat, SoLuongKhach, TongTien, TrangThai, ThongBao) VALUES
(1, 1, 1, '2024-12-20', 2, 1000000, N'Đã xác nhận', NULL),
(1, 2, 1, '2024-12-20', 5, 1500000, N'Đã xác nhận', NULL),
(2, 2, 1, '2024-12-25', 4, 1200000, N'Đã hủy', NULL),
(2, 1, 1, '2024-12-25', 3, 1500000, N'Đã hủy', NULL);
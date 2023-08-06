
use master
drop database java4
create database  java4

use java4


CREATE TABLE users (
	userid INT IDENTITY(1,1) NOT NULL,
    email VARCHAR(255) NOT NULL,
    [password] VARCHAR(255) NOT NULL,
    isActive BIT DEFAULT 1,
	isAdmin BIT DEFAULT 0,
	PRIMARY KEY (userid)
);

CREATE TABLE video (
    videoid INT IDENTITY(1,1) NOT NULL,
	title nvarchar(50),
	href varchar(max),
    [like] INT NULL,
    poster varchar(max)
);


INSERT INTO users (email, [password], isAdmin)
VALUES 
    ('dang@poly.vn', 'admin', 1),
    ('Java4@poly.vn', 'java4',0);

INSERT INTO video (title, href, [like], poster)
VALUES 
    (N'Khoa Pug ', 'https://www.youtube.com/embed/vzEX-XywVM8',11, 'https://th.bing.com/th/id/OIP.CtqtWfso1KEI_sNH8rN94AHaEK?w=278&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7'),
    (N'Cuộc Phiêu Lưu Của Văn-Gốc', 'https://www.youtube.com/embed/B2QPystP2ZI', 12,'https://tse1.mm.bing.net/th?&id=OVP.6TWkjMczTmfv5nujQy-THwEsDh&w=330&h=186&c=7&pid=1.7&rs=1'),
    (N'Vẽ tranh phong cảnh', 'https://www.youtube.com/embed/ttf8AQYayNc',21, 'https://tse1.mm.bing.net/th?&id=OVP.xaFTi9WzWUtrY1pHGmPwnAEsDh&w=330&h=186&c=7&pid=1.7&rs=1');

select * from users
select * from video

SELECT * FROM users u WHERE u.email = 'dang@poly.vn' AND u.password = 'admin' AND u.isActive = 1
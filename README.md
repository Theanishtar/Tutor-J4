# Tutor-J4

## Giai đoạn 1
- Viết báo cáo
- Chức năng đăng nhập (hard code)
- Chức năng đăng ký (Gửi mail khi hoàn tất)
- Chức năng load videos lên JSP
- [VIDEO BÀI GIẢNG](https://youtu.be/xbMoY_UMJKw)

## Giai đoạn 2
- CRUD dữ liệu DB bằng JPA [SRC CODE](https://github.com/Theanishtar/Tutor-J4/tree/ASM2)


## Ôn thi
- [MAPPING VỚI DB](https://github.com/dangtranhuu/Java4-FinalTest)
- [Video bài giảng](https://www.youtube.com/watch?v=CUtbXtRVFR8&t=811s)
- ...



## Các dependencies
```xml
<dependencies>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/javax.servlet/jstl -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>

		<dependency>
			<groupId>javax.mail</groupId>
			<artifactId>mail</artifactId>
			<version>1.4.7</version>
		</dependency>

	</dependencies>
```

## Chức năng gửi mail
```java
public static boolean sendmail(String to, String subjecta, String from, String bodya) {
		String subject = subjecta;
		String body = "Nội dung: "+bodya;

		// Thiết lập các thuộc tính của email
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				String username = "$%$%$%$$@gmail.com";
				String password = "$%$%$%$$";
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Tạo message và thiết lập thông tin
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("your.email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(body);

			// Gửi email
			System.out.println("Dang gui!");
			Transport.send(message);

			// Chuyển hướng về trang thành công
			System.out.println("Gui thanh cong!");
			return true;
		} catch (MessagingException e) {
			// Chuyển hướng về trang thất bại với thông báo lỗi
			System.out.println("Loi!");
			return false;
		}
	}
```

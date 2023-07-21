package com.poly.dao;

import java.util.ArrayList;
import java.util.List;

import com.poly.model.Video;

public class VideoDAO {
	public List<Video> findAll(){
		List<Video> list = new ArrayList<>();
		list.add(new Video("Khoa Pug ", "https://www.youtube.com/embed/vzEX-XywVM8","https://th.bing.com/th/id/OIP.CtqtWfso1KEI_sNH8rN94AHaEK?w=278&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",24,"hello"));
		list.add(new Video("Cuộc Phiêu Lưu Của Văn-Gốc", "https://www.youtube.com/embed/B2QPystP2ZI","https://tse1.mm.bing.net/th?&id=OVP.6TWkjMczTmfv5nujQy-THwEsDh&w=330&h=186&c=7&pid=1.7&rs=1",11,"hello"));
		list.add(new Video("Vẽ tranh phong cảnh", "https://www.youtube.com/embed/ttf8AQYayNc","https://tse1.mm.bing.net/th?&id=OVP.xaFTi9WzWUtrY1pHGmPwnAEsDh&w=330&h=186&c=7&pid=1.7&rs=1",45,"hello"));
		
		return list;
	}
}

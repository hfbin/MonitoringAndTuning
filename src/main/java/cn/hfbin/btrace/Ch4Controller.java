package cn.hfbin.btrace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/btrace")
public class Ch4Controller {

	//PrintArgSimple.java
	@RequestMapping("/arg1")
	public String arg1(@RequestParam("name")String name) {
		return "hello,"+name;
	}


	//PrintArgComplex.java
	@RequestMapping("/arg2")
	public User arg2(User user) {
		return user;
	}

	//PrintConstructor.java  打印复杂类型字段值
	@RequestMapping("/constructor")
	public User constructor(User user) {
		return user;
	}
	
	@RequestMapping("/same1")
	public String same(@RequestParam("name")String name) {
		return "hello,"+name;
	}

	@RequestMapping("/same2")
	public String same(@RequestParam("name")String name,@RequestParam("id")int id) {
		return "hello,"+name+","+id;
	}

	//PrintOnThrow.java
	@RequestMapping("/exception")
	public String exception() {
		try {
			System.out.println("start...");
			System.out.println(1/0);
			System.out.println("end...");
		}catch(Exception e) {
			//
		}
		return "success";
	}

}

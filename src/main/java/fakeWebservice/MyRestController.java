package fakeWebservice;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping(value = "/users/1")
	public @ResponseBody String method1() throws IOException {
		return "1";
	}

}
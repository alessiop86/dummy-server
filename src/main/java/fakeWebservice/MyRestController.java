package fakeWebservice;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Rest {

	@RequestMapping(value = "/users/1")
	public @ResponseBody String tags() throws IOException {
		return "1";
	}

}
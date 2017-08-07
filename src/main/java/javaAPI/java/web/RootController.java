package javaAPI.java.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller sits at the root of your application and returns a non-op 200 OK when it receives
 * a GET request.  This supports heart-beat checks on the application and should NOT be removed
 * or modified.
 * 
 * @author ahisley
 *
 */
@RestController
@RequestMapping("/")
public class RootController {

	@RequestMapping(method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public Object heartBeat()
	{
		return "OK";
	}
}

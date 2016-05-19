package spittr.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.error.EmptyFile;


//In application any controller throw emptyfile exception then ControllerAdvice will execute and emptyfile.jsp as output
@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(EmptyFile.class)
	public String emptyfile()
	{
		return "emptyfile";
	}
}

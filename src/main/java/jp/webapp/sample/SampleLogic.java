package jp.webapp.sample;

import org.springframework.stereotype.Component;

@Component
public class SampleLogic {

	public String sample(String param) {
		return param + param;
	}

}

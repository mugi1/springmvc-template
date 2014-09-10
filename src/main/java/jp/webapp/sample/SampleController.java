package jp.webapp.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@Autowired
	private SampleLogic sampleLogic;

	/**
	 * Sample mapping
	 *
	 * http://xxx.xxx.xxx/{context}/hoge
	 * or
	 * http://xxx.xxx.xxx/{context}/hoge?piyo=123
	 */
	@RequestMapping(value = "/hoge", method = { RequestMethod.GET, RequestMethod.POST })
	public String sampleMapping(@RequestParam(value = "piyo", required = false) String param, Model m) {

		String fuga = sampleLogic.sample(param);

		// set parameter
		m.addAttribute("fuga", fuga);

		// mapping to sample.jsp
		return "sample";
	}
}

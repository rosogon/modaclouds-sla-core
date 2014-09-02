package eu.atos.sla.parser.json;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import eu.atos.sla.parser.ParserException;
import eu.atos.sla.parser.data.wsag.Agreement;
import eu.atos.sla.parser.data.wsag.Template;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/serializers-test-context.xml")
public class TestJSONParser {
	private static Logger logger = Logger.getLogger(TestJSONParser.class);
	
	@Test
	public void testAgreementJSONParser() {
		File file = new File("../samples/agreement06.json");
		boolean error = false;
		try {
			String serializedData = getStringFromInputStream(new FileInputStream(file));
			AgreementParser agreementParser = new AgreementParser();
			Agreement wsagObject = agreementParser.getWsagObject(serializedData);
			logger.fatal("Readed agreement:"+wsagObject);
			String wsagData = agreementParser.getWsagAsSerializedData(serializedData);
			agreementParser.getSerializedData(wsagData);
		} catch (FileNotFoundException e1) {
			logger.fatal(e1);
		} catch (ParserException e) {
			error = true;
			logger.fatal(e);
		}
		
		assert(!error);
	}

	
	@Test
	public void testTemplateJSONParser() {
		//TODO missing template JSON file
		File file = new File("../samples/template01.json");
		boolean error = false;
		try {
			String serializedData = getStringFromInputStream(new FileInputStream(file));
			TemplateParser templateParser = new TemplateParser();
			Template wsagObject = templateParser.getWsagObject(serializedData);
			logger.info("Readed template:"+wsagObject);
			String wsagData = templateParser.getWsagAsSerializedData(serializedData);
			logger.info(templateParser.getSerializedData(wsagData));
		} catch (FileNotFoundException e1) {
			logger.fatal(e1);
		} catch (ParserException e) {
			error = true;
			logger.fatal(e);
		}
		
		assert(!error);
	}

	
	
	
	private String getStringFromInputStream(InputStream is) {
		 
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
 
		String line;
		try {
 
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
 
		return sb.toString();
 
	}	
}
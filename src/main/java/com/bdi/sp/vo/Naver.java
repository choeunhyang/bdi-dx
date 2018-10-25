package com.bdi.sp.vo;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Repository
public class Naver {
	
	private Message message;
	
	public Message getMessage() {
		return message;
	}
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public class Message{
		private Result result;
		
		public Result getResult() {
			return result;
		}
		
		public void setResult(Result result) {
			this.result = result;
		}
		@JsonIgnoreProperties(ignoreUnknown=true)
		public class Result{
			private String translatedText;

			public String getTranslatedText() {
				return translatedText;
			}

			public void setTranslatedText(String translatedText) {
				this.translatedText = translatedText;
			}
			
		}
	}
	
	/*public static String getText(String msg) {
		ObjectMapper om = new ObjectMapper();
		HttpURLConnection con = null;
		BufferedReader br = null;
		String url = "https://openapi.naver.com/v1/language/translate";
		try {
			URL u = new URL(url);
			msg = URLEncoder.encode(msg,"utf-8");
			con = (HttpURLConnection)u.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
			con.setRequestProperty("X-Naver-Client-Id","Jgiaxuv0rqpNrCjAQTk3");
			con.setRequestProperty("X-Naver-Client-Secret","JtIBm4QpLX");
			String param = "source=ko&target=en&text=" + msg;
			con.setDoOutput(true);
			DataOutputStream dos = new DataOutputStream(con.getOutputStream());
			dos.writeBytes(param);
			dos.flush();
			dos.close();
			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line = null;
			String text = "";
			while((line = br.readLine())!=null) {
				text += line;
			}
			//System.out.println(text);
			Naver n = om.readValue(text,Naver.class);
			return n.getMessage().getResult().getTranslatedText();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}*/
	
	/*public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();
		Naver n = om.readValue("{\r\n" + 
				"\"message\": {\r\n" + 
				"\"@type\": \"response\",\r\n" + 
				"\"@service\": \"naverservice.labs.api\",\r\n" + 
				"\"@version\": \"1.0.0\",\r\n" + 
				"\"result\": {\r\n" + 
				"\"translatedText\": \"Nice to meet you.\",\r\n" + 
				"\"srcLangType\": \"ko\"\r\n" + 
				"}\r\n" + 
				"}\r\n" + 
				"}", Naver.class);
		System.out.println(n.getMessage().getResult().getTranslatedText());
		getText(n.getMessage()+"");
		
		String text = getText("안녕하세요.");
		System.out.println(text);
	};*/
}

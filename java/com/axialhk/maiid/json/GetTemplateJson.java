package com.axialhk.maiid.json;

public class GetTemplateJson extends AbstractJson{
	private String encodedXml;
	private String templateId;
	public String getEncodedXml() {
		return encodedXml;
	}
	public void setEncodedXml(String encodedXml) {
		this.encodedXml = encodedXml;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
}

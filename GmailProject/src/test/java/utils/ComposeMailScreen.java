package utils;

import org.sikuli.script.Pattern;

public class ComposeMailScreen {	
		
	private Pattern composeBtn = new Pattern(System.getProperty("user.dir")+"\\logo\\composeBtn.png");
	private Pattern idExistComposeBtn = new Pattern(System.getProperty("user.dir")+"\\logo\\idExistComposeBtn.png");
	private Pattern toTxtBx = new Pattern(System.getProperty("user.dir")+"\\logo\\toTxtBx.png");
	private Pattern subjectTxtBx = new Pattern(System.getProperty("user.dir")+"\\logo\\SubjectTxtBx.png");
	private Pattern mailBodyTxtBx = new Pattern(System.getProperty("user.dir")+"\\logo\\mailBodyTxtBx.png");
	private Pattern attachmentLnk = new Pattern(System.getProperty("user.dir")+"\\logo\\attachmentLink.png");
	private Pattern sendBtn = new Pattern(System.getProperty("user.dir")+"\\logo\\sendBtn.png");
			
	public Pattern getComposeBtn() {
		return composeBtn;
	}
	public Pattern getIdExistComposeBtn() {
		return idExistComposeBtn;
	}
	public Pattern getToTxtBx() {
		return toTxtBx;
	}
	public Pattern getSubjectTxtBx() {
		return subjectTxtBx;
	}
	public Pattern getMailBodyTxtBx() {
		return mailBodyTxtBx;
	}
	public Pattern getAttachmentLnk() {
		return attachmentLnk;
	}
	public Pattern getSendBtn() {
		return sendBtn;
	}
	
}

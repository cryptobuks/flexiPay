package com.workpoint.mwallet.shared.responses;

public class SaveTemplateResponse extends BaseResponse{
	
	boolean isSent=false;
	public SaveTemplateResponse() {
	}
	
	public void setSaved(boolean isSent){
		this.isSent = isSent;
	}

}

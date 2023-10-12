package com.acorn.open.uis;

public class DataDto {
	Object imageUrl1;
	Object informGrade  ;
    Object informCause ;
    Object dataTime ;
    
	public DataDto(	Object imageUrl1 ,Object informGrade, Object informCause, Object dataTime) {
		this.imageUrl1= imageUrl1;
		this.informGrade = informGrade;
		this.informCause = informCause;
		this.dataTime = dataTime;
	}

	 

	@Override
	public String toString() {
		return "DataDto [imageUrl1=" + imageUrl1 + ", informGrade=" + informGrade + ", informCause=" + informCause
				+ ", dataTime=" + dataTime + "]";
	}



	public Object getInformGrade() {
		return informGrade;
	}

	public void setInformGrade(String informGrade) {
		this.informGrade = informGrade;
	}

	public Object getInformCause() {
		return informCause;
	}

	public void setInformCause(String informCause) {
		this.informCause = informCause;
	}

	public Object getDataTime() {
		return dataTime;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
    
    
   
}

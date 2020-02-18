package com.havishApp.config;

import com.havishApp.Exception.NoRecordFoundException;

public interface ICustomSequenceDao {
	
	public String userCartIdSeq()throws NoRecordFoundException;

}

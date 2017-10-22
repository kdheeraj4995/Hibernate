package com.practice.Querying;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQueries(value = { 
		@NamedQuery(name = "DemoData.All", query = "from DemoData"),
		@NamedQuery(name = "DemoData.byId", query = "from DemoData where dataName = ? "),
		@NamedQuery(name = "DemoData.byName", query = "from DemoData where dataName = :Name")
})
public class DemoData {
	@Id
	@GeneratedValue
	private int dataId;
	private String dataName;
	private String dataDesc;

	public int getDataId() {
		return dataId;
	}

	public void setDataId(int dataId) {
		this.dataId = dataId;
	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public String getDataDesc() {
		return dataDesc;
	}

	public void setDataDesc(String dataDesc) {
		this.dataDesc = dataDesc;
	}

}

package com.soarhz.application.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "HZ_SPFHT", name = "TPN_YXSHTQD")
public class HzSpfhtTpnYxshtqd implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private Long yxshtcode;

	@Column
	private Long fwid;

	@Column
	private Long fwcode;

	@Column
	private String fwzl;

	@Column
	private Double htmj;

	@Column
	private Double htje;

	@Column
	private Double dj;

	@Column
	private String htbh;

	@Column
	private Date htqdsj;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getYxshtcode() {
		return yxshtcode;
	}

	public void setYxshtcode(Long yxshtcode) {
		this.yxshtcode = yxshtcode;
	}

	public Long getFwid() {
		return fwid;
	}

	public void setFwid(Long fwid) {
		this.fwid = fwid;
	}

	public Long getFwcode() {
		return fwcode;
	}

	public void setFwcode(Long fwcode) {
		this.fwcode = fwcode;
	}

	public String getFwzl() {
		return fwzl;
	}

	public void setFwzl(String fwzl) {
		this.fwzl = fwzl;
	}

	public Double getHtmj() {
		return htmj;
	}

	public void setHtmj(Double htmj) {
		this.htmj = htmj;
	}

	public Double getHtje() {
		return htje;
	}

	public void setHtje(Double htje) {
		this.htje = htje;
	}

	public Double getDj() {
		return dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public String getHtbh() {
		return htbh;
	}

	public void setHtbh(String htbh) {
		this.htbh = htbh;
	}

	public Date getHtqdsj() {
		return htqdsj;
	}

	public void setHtqdsj(Date htqdsj) {
		this.htqdsj = htqdsj;
	}
}

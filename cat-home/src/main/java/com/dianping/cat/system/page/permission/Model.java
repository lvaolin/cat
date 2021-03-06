/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.cat.system.page.permission;

import org.unidal.web.mvc.ViewModel;

import com.dianping.cat.system.SystemPage;

public class Model extends ViewModel<SystemPage, Action, Context> {

	public static final String SUCCESS = "Success";

	public static final String FAIL = "Fail";

	private String m_content;

	private String m_opState = SUCCESS;

	public Model(Context ctx) {
		super(ctx);
	}

	@Override
	public Action getDefaultAction() {
		return Action.USER;
	}

	public String getContent() {
		return m_content;
	}

	public void setContent(String content) {
		m_content = content;
	}

	public String getOpState() {
		return m_opState;
	}

	public void setOpState(boolean result) {
		if (result) {
			m_opState = SUCCESS;
		} else {
			m_opState = FAIL;
		}
	}

	public String getDomain() {
		return "";
	}

	public String getIpAddress() {
		return "";
	}

	public String getDate() {
		return "";
	}

	public String getReportType() {
		return "";
	}
}

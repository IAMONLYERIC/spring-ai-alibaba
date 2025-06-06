/*
 * Copyright 2024-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cloud.ai.model;

import com.alibaba.cloud.ai.service.runner.RunnableModel;

public class App implements RunnableModel {

	private AppMetadata metadata;

	/**
	 * Spec has different implementations depending on the type of application. e.g.
	 * Workflow
	 */
	private Object spec;

	public App(AppMetadata metadata, Object spec) {
		this.metadata = metadata;
		this.spec = spec;
	}

	@Override
	public String id() {
		return metadata.getId();
	}

	public AppMetadata getMetadata() {
		return metadata;
	}

	public App setMetadata(AppMetadata metadata) {
		this.metadata = metadata;
		return this;
	}

	public Object getSpec() {
		return spec;
	}

	public App setSpec(Object spec) {
		this.spec = spec;
		return this;
	}

}

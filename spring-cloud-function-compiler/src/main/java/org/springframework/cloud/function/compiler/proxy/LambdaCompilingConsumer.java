/*
 * Copyright 2012-2019 the original author or authors.
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

package org.springframework.cloud.function.compiler.proxy;

import java.util.function.Consumer;

import org.springframework.cloud.function.compiler.ConsumerCompiler;
import org.springframework.core.io.Resource;

/**
 * @param <T> input argument type
 * @author Mark Fisher
 */
public class LambdaCompilingConsumer<T> extends AbstractLambdaCompilingProxy<Consumer<T>>
		implements Consumer<T> {

	public LambdaCompilingConsumer(Resource resource, ConsumerCompiler<T> compiler) {
		super(resource, compiler);
	}

	@Override
	public void accept(T input) {
		this.getTarget().accept(input);
	}

}

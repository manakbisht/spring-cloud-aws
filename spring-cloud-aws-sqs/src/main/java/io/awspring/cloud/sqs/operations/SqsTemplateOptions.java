/*
 * Copyright 2013-2023 the original author or authors.
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
package io.awspring.cloud.sqs.operations;

import io.awspring.cloud.sqs.listener.QueueNotFoundStrategy;
import java.util.Collection;
import software.amazon.awssdk.services.sqs.model.MessageSystemAttributeName;
import software.amazon.awssdk.services.sqs.model.QueueAttributeName;

/**
 * Sqs specific options for the {@link SqsTemplate}.
 *
 * @param <T> the payload type.
 */
public interface SqsTemplateOptions<T> extends MessagingTemplateOptions<T, SqsTemplateOptions<T>> {

	/**
	 * The {@link QueueNotFoundStrategy} for this template.
	 *
	 * @param queueNotFoundStrategy the strategy.
	 * @return the options instance.
	 */
	SqsTemplateOptions<T> queueNotFoundStrategy(QueueNotFoundStrategy queueNotFoundStrategy);

	/**
	 * The queue attribute names that will be retrieved by this template and added as headers to received messages.
	 * Default is none.
	 *
	 * @param queueAttributeNames the names.
	 * @return the options instance.
	 */
	SqsTemplateOptions<T> queueAttributeNames(Collection<QueueAttributeName> queueAttributeNames);

	/**
	 * The message attributes to be retrieved with the message and added as headers to received messages. Default is
	 * ALL.
	 *
	 * @param messageAttributeNames the names.
	 * @return the options instance.
	 */
	SqsTemplateOptions<T> messageAttributeNames(Collection<String> messageAttributeNames);

	/**
	 * The message system attributes to be retrieved with the message and added as headers to received messages. Default
	 * is ALL.
	 *
	 * @param messageSystemAttributeNames the names.
	 * @return the options instance.
	 */
	SqsTemplateOptions<T> messageSystemAttributeNames(
			Collection<MessageSystemAttributeName> messageSystemAttributeNames);

}

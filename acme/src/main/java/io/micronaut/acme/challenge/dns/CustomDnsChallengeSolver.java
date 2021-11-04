/*
 * Copyright 2017-2021 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.acme.challenge.dns;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
@Replaces(DnsChallengeSolver.class)
class CustomDnsChallengeSolver implements DnsChallengeSolver {
    @Override
    public void createRecord(String domain, String digest) {
        // Create a TXT record for _acme-challenge.$domain with the value of $digest
    }

    @Override
    public void destroyRecord(String domain) {
        // Remove the TXT record for _acme-challenge.$domain if it exists
    }
}

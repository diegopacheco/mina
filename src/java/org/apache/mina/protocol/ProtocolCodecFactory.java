/*
 *   @(#) $Id$
 *
 *   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.mina.protocol;

/**
 * Provides {@link ProtocolEncoder} and {@link ProtocolDecoder} which translates
 * binary or protocol specific data into message object and vice versa.
 * <p>
 * Please refer to
 * <a href="../../../../../xref-examples/org/apache/mina/examples/reverser/ReverseProtocolProvider.html"><code>ReverserProtocolProvider</code></a>
 * example.
 *  
 * @author The Apache Directory Project (dev@directory.apache.org)
 * @version $Rev$, $Date$
 */
public interface ProtocolCodecFactory
{
    /**
     * Creates a new instance of {@link ProtocolEncoder} which encodes message
     * objects into binary or protocol-specific data.
     */
    ProtocolEncoder newEncoder();

    /**
     * Creates a new instance of {@link ProtocolDecoder} which decodes binary or
     * protocol-specific data into message objects.
     */
    ProtocolDecoder newDecoder();
}
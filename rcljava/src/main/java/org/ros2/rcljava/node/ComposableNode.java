/* Copyright 2017 Esteve Fernandez <esteve@apache.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ros2.rcljava.node;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.ros2.rcljava.client.Client;
import org.ros2.rcljava.concurrent.Callback;
import org.ros2.rcljava.consumers.Consumer;
import org.ros2.rcljava.consumers.TriConsumer;
import org.ros2.rcljava.qos.QoSProfile;
import org.ros2.rcljava.interfaces.Disposable;
import org.ros2.rcljava.interfaces.MessageDefinition;
import org.ros2.rcljava.interfaces.ServiceDefinition;
import org.ros2.rcljava.publisher.Publisher;
import org.ros2.rcljava.service.RMWRequestId;
import org.ros2.rcljava.service.Service;
import org.ros2.rcljava.subscription.Subscription;
import org.ros2.rcljava.timer.WallTimer;

/**
 * This class serves as a bridge between ROS2's rcl_node_t and RCLJava.
 * A Node must be created via @{link RCLJava#createNode(String)}
 */
public interface ComposableNode {
  Node getNode();
}
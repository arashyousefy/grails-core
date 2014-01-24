package grails.test.runtime;

import groovy.transform.Immutable

class TestEvent {
    TestRuntime runtime
    String name
    Map<String, Object> arguments
    boolean stopDelivery
    boolean immediateDelivery
    boolean reverseOrderDelivery
}

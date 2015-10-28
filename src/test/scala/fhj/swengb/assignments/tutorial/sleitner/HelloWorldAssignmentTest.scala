package fhj.swengb.assignments.tutorial.sleitner

import org.junit.Assert._
import org.junit.Test

class HelloWorldAssignmentTest {

  @Test def test(): Unit = {
    assertEquals("Hello IMA14!",HelloWorldAssignment.hello())
  }

}

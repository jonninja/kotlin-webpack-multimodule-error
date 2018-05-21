package samplejs

import sample.common.SampleCommon

fun main(args: Array<String>) {
//    val ce = CandidateEvent("processor", "source", "name")
//    val sc = SomeClass("Some Name")
//    val event = CandidateEvent("some_processor", "123", "A name")
//    console.log(JSON.stringify(ce))

    val sc = SampleCommon("Some Name")
    println(sc.name)
}
//
//@Serializable
//data class SomeClass(val name: String)
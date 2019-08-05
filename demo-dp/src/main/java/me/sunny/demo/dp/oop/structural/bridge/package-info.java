/**
 * 桥接模式（Bridge)是一种结构型设计模式
 *
 * 基于类的最小设计原则，通过使用封装、聚合及继承等行为让不同的类承担不同的职责。
 * 如果软件系统中某个类存在两个独立变化的维度，通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职责原则”。
 *
 * 与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层建立一个抽象关联，
 * 该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式。
 *
 * 特点:
 * 把抽象(Abstraction)与行为实现(Implementation)分离开来，从而可以保持各部分的独立性以及应对他们的功能扩展。
 *
 * 场景：
 * 一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展，
 * 对于那些不希望使用继承或因为多层继承导致系统类的个数急剧增加的系统，桥接模式尤为适用
 *
 * 与适配器模式：
 * 桥接模式和适配器模式用于设计的不同阶段，桥接模式用于系统的初步设计，
 * 对于存在两个独立变化维度的类可以将其分为抽象化和实现化两个角色，使它们可以分别进行变化；
 *
 * 而在初步设计完成之后，当发现系统与已有类无法协同工作时，可以采用适配器模式。
 * 但有时候在设计初期也需要考虑适配器模式，特别是那些涉及到大量第三方应用接口的情况。
 *
 * https://blog.csdn.net/jdfk423/article/details/82463491
 */
package me.sunny.demo.dp.oop.structural.bridge;
/**
 * 备忘录模式
 *
 * 在不破坏封装性的前提下捕获一个对象内部的状态，并在对象之外保存这个状态，以便对象以后恢复到这一状态。
 * 备忘录模式可以使系统恢复到某一历史时期的状态，又称标记模式。
 * 是一种对象行为型模式，其别名为Token。
 *
 * 优点：
 * 提供状态恢复。对象恢复到特定的历史步骤。
 * 封装信息。备忘录保存了原发器的状态，并且只有原发器可以改动。
 *
 * 缺点：
 * 资源消耗大。特别是保存的原发器类的对象较多时，需要占据内存，保存操作也需要开销。
 *
 * 适用:
 * 保存一个对象在某一个时刻的全部状态或部分状态，这样以后需要时它能够恢复到先前的状态，实现撤销操作。
 * 需要封装对象的历史状态，并且避免暴露给其他对象。
 *
 * 应用:
 * 1. JDK :
 * Date类通过fastTime这一变量保存历史时间。
 * public class Date implements java.io.Serializable, Cloneable, Comparable<Date> {
 *     private transient long fastTime;
 * }
 *
 * 2. 浏览器回退
 * 3. 数据库备份与还原
 * 4. 编辑器撤销与重做
 *    在编辑器上编辑文字，写错时可以按快捷键 Ctrl + z 撤销，撤销后可以按 Ctrl + y 重做
 * 5. 虚拟机生成快照与恢复
 *    虚拟机可以生成一个快照，当虚拟机发生错误时可以恢复到快照的样子
 * 6. Git版本管理
 *    每提交一个新版本，Git就会把它们自动串成一条时间线，每个版本都有一个版本号，
 *    使用 git reset --hard 版本号 即可回到指定的版本，让代码时空穿梭回到过去某个历史时刻
 * 7. 棋牌游戏悔棋
 */
package me.sunny.demo.dp.oop.behavioral.memento;
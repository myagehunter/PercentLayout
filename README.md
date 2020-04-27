# PercentFrameLayout
自定义百分比控件布局及适配终结者，解决安卓适配难题

 * xmlns:android=”http://schemas.android.com/apk/res/android”
 *  xmlns --->xml namespace  声明我们开始定义的命名空间
 *  andorid -->namespace-prefix 它是命名空间名字
 *  作用：相当于程序中的URI固定不变，给我们开发的时候语法文件提示输入
 *
 * xmlns:tools=”http://schemas.android.com/tools”
 * tools:一个属于开发阶段的工具，理解为开发阶段编写的属性，当安装手机上时候属性消失，比如测试时候添加中文名称填满视图
 * 如果添加tools:context=”包名.MainActivity”可以在视图中看到MainActivity主题的效果
 * tools:layout=@layout/yourfragmentlayoutname  在测试阶段就在布局预览窗口上显示Activity上加载一个fragment
 *
 * 自定义命名空间  xmlns:app=”http://schemas.android.com/apk/res-auto”
  作用:当我们自定义布局view 时候，给xml里添加属性的作用，达到改变视图 统一这样命名，属性写在attr里
 
 * 一.自定义控件PercentFrameLayout、PercentLinearLayout、PercentRelativeLayout 三个控件基本一致，系统化布局是通过LayoutInflater来实现
 类如在setContentView中常用LayoutParams来让父view 决定如何摆放的位置以及宽高属性，当我们把ClidView写到布局里，而布局的LayoutParams
 是有generateDefaultLayoutParams来设置，而自定义PercentRelativeLayout控件就是实现generateLayoutParams这个方法并且返回的继承RelativeLayout.LayoutParams
 这样保留控件原有属性， generateLayoutParams的方法参数是AttrbuteSet，里面包含了声明的属性值，最后通过PrecentLayoutHelper对AttributeSet进行解析，
  解析结果保存在数据结构PreLayoutInfo 中，最后通过onMeasure-->onLayout-->onDraw,在onMeasure中adjustChildren方法遍历所有子view，通过子view 的
  PercentLayoutHelper.LayoutParams的宽高百分比换算为实际的占用像素宽高，并保存在对应的子view的LayoutParams里，之后再调用原有的OnMeasure,这样就
  可以实现宽高的百分比转换。
 * 二.ConstraintLayout 适配终结者（基本适配所有机型）
  它可以在api9以上的安卓系统使用，在Android studio 2.3以后，官方默认的ConstrainLayout，主要解决布局嵌套过多问题，比RelativeLayout更灵活性能更好
  铺满全屏 
  app:layout_constraintBottom_toBottomOf="parent"
  app:layout_constraintEnd_toEndOf="parent"
  app:layout_constraintStart_toStartOf="parent"
  app:layout_constraintTop_toTopOf="parent"
  app:layout_constraintHorizontal_bias="0.5" app:layout_constraintVertical_bias="0.6"  1为100%，这里可填小数。横向0表示，屏幕最左边，1表示     最右边，对应了屏幕坐标轴
  用法：implementation 'com.android.support.constraint:constraint-layout:1.1.3'
 
# PercentFrameLayout
Custom percentage control layout and adaptor terminator, solve the android adaptor problem
* XMLNS: android = "http://schemas.android.com/apk/res/android"
* XMLNS - & gt;The XML namespace declares the namespace we started defining
* android - & gt;Namespace-prefix is the namespace name
* function: equivalent to the program in the URI fixed, give us the development of the syntax file prompt input
*
* XMLNS: tools = "http://schemas.android.com/tools"
* tools: a tool that belongs to the development phase, which is understood as a property written in the development phase. When the property is installed on the phone, the property disappears, such as adding a Chinese name to fill the view when testing
* you can see the MainActivity theme in the view if you add tools:context= "package name.MainActivity.
* the tools: layout = @ layout/yourfragmentlayoutname during the testing phase is displayed on the layout preview window to load a fragment on the Activity
*
* the custom namespace XMLNS: app = "http://schemas.android.com/apk/res-auto"
Effect: when we customize the layout view, we add the effect of the attribute to the XML to change the view so that it is uniformly named, and the attribute is written in attr
 
* 1. The custom controls PercentFrameLayout, PercentLinearLayout and PercentRelativeLayout are basically the same, and the systematic layout is realized by LayoutInflater
For example, in setContentView, we often use LayoutParams to let the parent view decide where to put it and the width and height properties, when we write ClidView to the layout, and the LayoutParams of the layout
Is generateDefaultLayoutParams to set up, and the custom PercentRelativeLayout control is implemented generateLayoutParams this method and returns the inheritance RelativeLayout. LayoutParams
The method parameter of generateLayoutParams is AttrbuteSet, which contains the declared attribute value. Finally, AttributeSet is parsed by PrecentLayoutHelper.
The analysis results are saved in the data structure PreLayoutInfo, and finally through onMeasure--&gt;OnLayout - & gt;OnDraw, in onMeasure the adjustChildren method traverses all the sub-views through the sub-view
PercentLayoutHelper. LayoutParams wide high percent conversion as the actual occupy high pixel wide, and stored in the corresponding sub in the LayoutParams of the view, and then call the original OnMeasure, thus
The percentage conversion of width and height can be achieved.
* 2. Adaptor for ConstraintLayout (basic adaptor for all models)
It can be used on Android systems with api9 or above. After Android studio 2.3, the official default ConstrainLayout is used to solve the problem of too many nested layouts, which is more flexible and better than a RelativeLayout
Covered with full screen
App: layout_constraintBottom_toBottomOf = "parent"
App: layout_constraintEnd_toEndOf = "parent"
App: layout_constraintStart_toStartOf = "parent"
App: layout_constraintTop_toTopOf = "parent"
App :layout_constraintHorizontal_bias="0.5" app:layout_constraintVertical_bias="0.6"Horizontal 0 represents the left side of the screen, and 1 represents the right side, which corresponds to the axis of the screen
Usage: implementation 'com. Android. Support. The constraint, the constraint - layout: 1.1.3'
 


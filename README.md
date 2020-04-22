# PercentFrameLayout
自定义百分比控件布局及适配终结者，解决安卓适配难题
/**
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
 *  作用:当我们自定义布局view 时候，给xml里添加属性的作用，达到改变视图 统一这样命名，属性写在attr里
 *
 * 自定义控件PercentFrameLayout、PercentLinearLayout、PercentRelativeLayout 三个控件基本一致，系统化布局是通过LayoutInflater来实现
 * 类如在setContentView中常用LayoutParams来让父view 决定如何摆放的位置以及宽高属性，当我们把ClidView写到布局里，而布局的LayoutParams
 * 是有generateDefaultLayoutParams来设置，而自定义PercentRelativeLayout控件就是实现generateLayoutParams这个方法并且返回的继承RelativeLayout.LayoutParams
 * 这样保留控件原有属性， generateLayoutParams的方法参数是AttrbuteSet，里面包含了声明的属性值，最后通过PrecentLayoutHelper对AttributeSet进行解析，
 * 解析结果保存在数据结构PreLayoutInfo 中，最后通过onMeasure-->onLayout-->onDraw,在onMeasure中adjustChildren方法遍历所有子view，通过子view 的
 * PercentLayoutHelper.LayoutParams的宽高百分比换算为实际的占用像素宽高，并保存在对应的子view的LayoutParams里，之后再调用原有的OnMeasure,这样就
 * 可以实现宽高的百分比转换。
 * ConstraintLayout 适配终结者（基本适配所有机型）

 */

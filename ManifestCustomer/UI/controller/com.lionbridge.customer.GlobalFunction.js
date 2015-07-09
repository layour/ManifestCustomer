//JavaScript Framework 2.0 Code

//声明一个命名空间
Type.registerNamespace('com.lionbridge.customer.GlobalFunction');

//在此命名空间下声明方法
com.lionbridge.customer.GlobalFunction.openAddressPicker = function(){
	$view.openPicker({
		"okaction" : "ok()", //确定后执行的JS方法
		"title" : "城市选择",
		"pickercount" : "1",
		"datasource" : {picker : [
			{select : [
				{value : "BJ", content : "北京市"}, 
				{value : "SH", content : "上海市"}, 
				{value : "GZ", content : "广州市"}, 
				{value : "CD", content : "成都市"}
			]}
		]},
		"picker2binder" : "name" //Context字段名，存放选中项的value
	})
}
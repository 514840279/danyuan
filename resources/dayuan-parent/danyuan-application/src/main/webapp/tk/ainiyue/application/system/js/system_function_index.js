var menu_data = [];
var url = "/authority/findTree";
ajaxPost(url, null, loadTree, 1000, findError);
function loadTree(result) {
	rel(result,$("#nestable"));
	window.parent.window.alert(JSON.stringify(result));
	var updateOutput = function(e) {
		var list = e.length ? e : $(e.target), output = list.data('output');
		if (window.JSON) {
			output.val(window.JSON.stringify(list.nestable('serialize')));// , null, 2));
		} else {
			output.val('JSON browser support required for this demo.');
		}
	};
	
	// activate Nestable for list 1
	$('#nestable').nestable({
		group : 1
	}).on('change', updateOutput);
	
	// activate Nestable for list 2
	$('#nestable2').nestable({
		group : 1
	}).on('change', updateOutput);
	
	// output initial serialised data
	updateOutput($('#nestable').data('output', $('#nestable-output')));
	updateOutput($('#nestable2').data('output', $('#nestable2-output')));
	
	$('#nestable-menu').on('click', function(e) {
		var target = $(e.target), action = target.data('action');
		if (action === 'expand-all') {
			$('.dd').nestable('expandAll');
		}
		if (action === 'collapse-all') {
			$('.dd').nestable('collapseAll');
		}
	});
	
	$('#nestable3').nestable();
	
};

function rel(result,node) {
	node.append(" <ol class=\"dd-list\"></ol> ");
	var $ol =node.find("ol");
	$.each(result, function(index, value) {
		$ol.append(" <li id ="+value.id+" class=\"dd-item\" data-id=\""+value.id+"\"><div  class=\"dd-handle\">"+value.name+"</div></li> ");
		if (value.list != null && value.list.length > 0) {
			rel(value.list,node.find("#"+value.id));
		}
	});
}

function findError() {
	window.parent.window.alert("出错了");
}

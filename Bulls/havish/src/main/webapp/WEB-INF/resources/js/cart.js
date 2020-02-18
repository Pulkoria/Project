$(document).ready(function(e) {
	alert("cartcc function ujgu mjglouijg");
	//$("#userCartId").val('');
	
	
	$(".submenuli").click(function() {
		var hv = $(this).$('#hidClass').attr("value");
		alert(hv);
		 // this variable name should be categoryId
		 var subCatgry = $(this).$('input[type=hidden]').val();
			 //$(this).attr('input[type=hidden][value=]');
		 
		 alert("cart clicked funccc"+subCatgry);
		 /*var subCategoryIdToAppendData = 'subCatListId'+subCatgry;
	     var userCartId = $(".userCartId").val();
			*/
	 });
	
	
	/*$(".icloseId").on('click', function(){
		alert("close dfgdf");
		//alert("emailId otp"+emailId);
		alert("cart clicked fun");
		var userCartId = $(".userCartId").val();
		
		//var userCartId = $(this).val();
		alert("userCartId on add" + userCartId);
		//window.location.href= 'deleteUserCart.htm?GET' +'&userCartId=' + userCartId
	});*/
	
	$("#sub").on('click', function(){
		alert("close dfgdf");
		$(".count").append('');
		$(".count").append(4);
	});
});
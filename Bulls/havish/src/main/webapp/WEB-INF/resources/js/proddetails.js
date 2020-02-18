$(document)
		.ready(
				function(e) {
					alert('prod  dtls functt varId func');
					 $('a[href="#addToCartId"]').click(function(){
					      alert('Sign'); 

					      	var prodId = $('#catgryId').val();
					      	var varId = $('#prodVarHidId').val();
					      	//var varId = "HVAR0014";
					        alert("varId"+varId);
					        var prodQuan = $("#number").val();
					        alert("prodQuan"+prodQuan);
					       
					      $.ajax({
					            url : 'addUserCartProDtls',
					            data :  { 
					            		"prodId" : prodId, 
							            "varId" : varId,
							            "quantity" : prodQuan
					            	 },
					            method : "GET",
					            dataType:'json',
					            success : function(dat) {
					               alert("sucess");
					            },
					            error : function(xhr, status, error) {
					            	console.log("error");
					                alert("error mesages");
					            }
					        });
					   }); 
					 		
					
					
});
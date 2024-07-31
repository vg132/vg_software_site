<html>
	<head>
		<title>jsTree - open source JavaScript treeview control</title>
		<script src="script/jsTree.js" type="text/javascript" language="JavaScript"></script>
		<script language="JavaScript" type="text/javascript">
			<!--

			var newNodeCount = 0

			function _foo()
			{
			}

			var arrNodes=
			[
				['VG Software',['javascript:_foo()'],
					[
						['Menus',['menu.jsp','content',,'test'],
							[
								['Anka',['http://www.autosport.com/','_new',,'test',]]
							]
						]
					]
				]
			]
			var jst_container = "document.getElementById('treeContainer')"
			var jst_image_folder = "images"
			//-->
		</script>
		<link rel="stylesheet" type="text/css" href="style/jsTree.css"/>
	</head>
	<body onLoad="renderTree();">
		<div id="treeContainer"></div>
	</body>
</html>
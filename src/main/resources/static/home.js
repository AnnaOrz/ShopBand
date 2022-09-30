let inputXYZ = document.getElementById("input");
let editor;
ClassicEditor
    .create( document.querySelector( '#editor' ) )
    .then( newEditor => {
        editor = newEditor;
    } )
    .catch( error => {
        console.error( error );
    } );


document.querySelector( '#submit' ).addEventListener( 'click', () => {
    inputXYZ.value = editor.getData();
} );


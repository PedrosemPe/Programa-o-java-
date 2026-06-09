package redeSocial;

class Comentario {
	
	String autor;
	String mensagem;
	int likes;
	
	void mostrarComentario() {
		
		System.out.println();
		System.out.println("Comentário: ");
		System.out.println();
		
		System.out.println("Autor: "+autor);
		System.out.println("Mensagem: "+mensagem);
		System.out.println("Likes: "+likes);
		
	}
}

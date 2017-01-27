package everything;

import java.util.*;
public class CharacterSelection {

	public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
	    
		ArrayList<String> charsHovered = new ArrayList<>();
		
		int horizIndex = 0;
		int vertIndex = 0;
		System.out.print(fighters[0][0]);
		
		for (String move : moves) {
			if(move.equals("up"))
			{
				if(vertIndex==0)
				{
					vertIndex++;
					charsHovered.add(fighters[horizIndex][vertIndex]);
				}
				else
				{
					charsHovered.add(fighters[horizIndex][vertIndex]);
					continue;
				}
			}
			if(move.equals("down"))
			{
				if(vertIndex==1)
				{
					vertIndex--;
					charsHovered.add(fighters[horizIndex][vertIndex]);
				}
				else
				{
					charsHovered.add(fighters[horizIndex][vertIndex]);
					continue;
				}
			}
			if(move.equals("left"))
			{
				if(0<horizIndex)
				{
					horizIndex--;
					charsHovered.add(fighters[horizIndex][vertIndex]);
				}
				else if(horizIndex == 0)
				{
					horizIndex = 5;
					charsHovered.add(fighters[horizIndex][vertIndex]);
				}
			}
			if(move.equals("right"))
			{
				if(horizIndex == 5)
				{
				horizIndex = 0;
				charsHovered.add(fighters[horizIndex][vertIndex]);
				}
				else if(horizIndex<5)
				{
					horizIndex++;
					charsHovered.add(fighters[horizIndex][vertIndex]);

				}
			}
		}
		
		String[] result = charsHovered.toArray(new String[charsHovered.size()]);
		
		return result;
	  }
	
	Node SortedInsert(Node head,int data) {
	    
	
		Node insert = new Node();
		insert.data = data;
		
		//insertion into an empty list;
		if(head == null)
		{
			head = insert;
		}
		
		//insertion into the beginning of a non-empty list
		
		if(data < head.data)
		{
			head.prev = insert;
			insert.next = head;
			head = insert;
		}
		
		//inseretion into middle or the end
		
		else
		{
			Node current = head;
			while(current.data < data && current.next!=null)
			{
				current = current.next;
			}
			
			//insert into middle
			if(current.data > data)
			{
				insert.next = current;
				insert.prev = current.prev;
				current.prev.next = insert;
				current.prev = insert;
			}
			else
			{
				current.next = insert;
				insert.prev = current;
			}
			
			
		}
	    return head;
	   
	}
}

class Node{
	int data;
	Node next;
	Node prev;
}

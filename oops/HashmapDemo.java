package demo.program.oops;

import java.util.HashMap;

									//HASHMAP DEMO//
						//INITIAL SIZE 16 : ONCE REACHED 75% SIZE IS DOUBLED //
public class HashmapDemo {

	public static void main(String[] args) {

								// CREATING HASHMAP OBJECT//

		HashMap<Integer, Integer> nums = new HashMap();
		
								//ASSINGING KEYS , VALUES //
		nums.put(1, 1000);
		nums.put(2, 2000);
		nums.put(3, 3000);
		nums.put(4, 4000);
		nums.put(5, 5000);
		
								// UDPATING VALUES//
		nums.put(2, 2020);
								
								//PRINTING ALL VALUES //
		System.out.println(nums);
		
								//REMOVING KEY PERMANENTLY//
		nums.remove(3);
		System.out.println(nums);

								//GETTING SPECIFIC KEY VALUES//
		System.out.println(nums.get(4));
		
								// PRINTING TOTAL SIZE //
		System.out.println("size : " + nums.size());

								// CHECKING KEY THERE OR NOT //
		System.out.println(nums.containsKey(2));
		
								// CHECKING VALUE THERE OR NOT //
		System.out.println(nums.containsValue(2000));

								// FOR EACH LOOP //
		for (Integer num : nums.keySet())
			System.out.println("key : " + nums + nums.get(num));
		
								//CLEAR COMPLETE INFORMATION//
		//nums.clear();

	}

}

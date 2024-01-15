using System;
using System.Collections;
using System.Net.Sockets;
using Newtonsoft;
using Newtonsoft.Json;

namespace CSProyect.utils
{
	 public class ManageJson<T>
	 {
		public static void save(List<T> list,string fileAdress)
		{
			string jsonText = JsonConvert.SerializeObject(list,Formatting.Indented);
			File.WriteAllText(fileAdress,jsonText);
		}

		public static List<T> read(string fileAdress)
		{
			string fileContents = File.ReadAllText(fileAdress);
			return JsonConvert.DeserializeObject<List<T>>(fileContents);
		}
	 }

}
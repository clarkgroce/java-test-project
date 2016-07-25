package exercises.java.java;

public class Exercise5 {

    public static void main(String[] args) {

        DataObject[] dataObjects = new DataObject[5];

        //Here we create the dataObject instance and initialize one of the 6 array objects in dataObjects, in this case
        //[0], with the value of "Friday" in the code member variable (in the DataObject class).
        DataObject dataObject = new DataObject();
        dataObject.code = "Friday";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Friday";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Saturday";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Saturday";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.code = "Saturday";
        dataObjects[4] = dataObject;

        int sum = 0;

        //In this for loop we loop through the dataObjects array objects and increment the sum variable where the
        //code member variable starts with "F".
        for (int i = 0; i < dataObjects.length; i++) {

            if (dataObjects[i].code.startsWith("F")) {
                ++sum;
            }

        }

        System.out.println(sum);



    }

}

    public void testForReport(){
    	//Fetch the subject with firstName Rudolph
    	List<Participant> participantList = dao.getByFirstName("Rudolph");
    	Participant participant = participantList.get(0);
    	try {
            String outputFileName = "C:\\TestReport.txt";

            // Create FileReader Object
            FileWriter outputFileReader  = new FileWriter(outputFileName);
            PrintWriter outputStream  = new PrintWriter(outputFileReader);
            outputStream.println("+---------- Auto generated report based on data retrieved from the c3pr database. ----------+");
            outputStream.println("");
            outputStream.println("");
            outputStream.println("--- Retrieving the participant ---");
            outputStream.println("Name: "+participant.getFullName());
            outputStream.println("Gender: "+participant.getAdministrativeGenderCode());
            outputStream.println("Race: "+participant.getRaceCode());
            outputStream.println("Address: " +participant.getAddress().getStreetAddress() + " "
            		+participant.getAddress().getCity()+ " "
            		+participant.getAddress().getStateCode()+ " "
            		+participant.getAddress().getCountryCode());
            outputStream.println("");
            outputStream.println("");
            outputStream.println("--- Retrieving the Registration details for the selected participant. ---");
            outputStream.println("--- Participant has "+participant.getStudySubjects().size()+" Registration(s). ---");
            outputStream.println("");
            
            StudySubject ss = null;        	
            for(int i=0;i<participant.getStudySubjects().size();i++){
            	//fetch all registrations for Rudolph.
            	ss = studySubjectDao.getById(participant.getStudySubjects().get(i).getId());
            	outputStream.println("Registration: " + i); 
            	try{
            		String xml = xmlUtility.toXML(ss);
            		String newXml=new XMLOutputter(Format.getPrettyFormat()).outputString(new SAXBuilder().build(new StringReader(xml)));
            		outputStream.println(newXml); 
            	}catch(XMLUtilityException xue){
            		log.error(xue.getMessage());
            	}catch (JDOMException je){
            		log.error(je.getMessage());
            	}
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("IOException:");
            e.printStackTrace();
        }
    }
    

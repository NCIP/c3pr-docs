	public void testForReport(){
		
    	try {
            String outputFileName = "C:\\TestReportStudy.txt";

            // Create FileReader Object
            FileWriter outputFileReader  = new FileWriter(outputFileName);
            PrintWriter outputStream  = new PrintWriter(outputFileReader);
            outputStream.println("+---------- Auto generated report based on data retrieved from the c3pr database. ----------+");
            outputStream.println("");
            outputStream.println("");
            outputStream.println("--- Retrieving the details for a Disease Term. ---");
            List<DiseaseTerm> dTermList = diseaseTermDao.getByCtepTerm("AIDS-related cervical cancer");
    		//display disease term data and now fetch studies with this disease term
            outputStream.println("Ctep Term: "+dTermList.get(0).getCtepTerm());
            outputStream.println("Disease Category Name: "+dTermList.get(0).getCategory().getName());
            outputStream.println("Term: "+dTermList.get(0).getTerm());
            
    		List<StudyDisease> sdList = dao.getByDiseaseTermId(dTermList.get(0).getId());
        	Study study = dao.getById(sdList.get(0).getStudy().getId());
        	outputStream.println("");
        	outputStream.println("--- Retrieving the details for a Study. ---");
            
        	try{
        		String xml = xmlUtility.toXML(study);
        		String newXml=new XMLOutputter(Format.getPrettyFormat()).outputString(new SAXBuilder().build(new StringReader(xml)));
        		outputStream.println(newXml); 
        	}catch(XMLUtilityException xue){
        		log.error(xue.getMessage());
        	}catch (JDOMException je){
        		log.error(je.getMessage());
        	}       	
        	
            outputStream.close();
        } catch (IOException e) {
            System.out.println("IOException:");
            e.printStackTrace();
        }
    }

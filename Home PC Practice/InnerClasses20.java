interface EmailServer 
{
	public void sendEmail(EmailDetails e);
	class EmailDetails 
	{
		String from;
		String to;
		String subject;
	}
}

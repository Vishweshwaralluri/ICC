package com.ICC.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateICC {
	   public CreateICC(WebDriver driver) {
		   PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "(//span[.='Permit Vision'][1])[1]")
    private WebElement permitvision;
 	public WebElement getpermitvision()  {
          return permitvision;       
    }
	@FindBy(xpath = "(//span[.='Isolation Management'])")
    private WebElement isolationmanagement;
    public WebElement getisolationmanagement()  {
          return isolationmanagement;
    }
    @FindBy(xpath = "(//span[.='Request'][1])[1]")
    private WebElement request;
    public WebElement getrequest()  {
          return request;
    }
    @FindBy(xpath = "(//span[.='Isolation'][1])[2]")
    private WebElement isolation;
    public WebElement getisolation()  {
          return isolation;         
    }
    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd'])")
    private WebElement title;
    public WebElement gettitle()  {
          return title;         
    }
    @FindBy(xpath = "(//textarea[@rows='3'][1])[1]")
    private WebElement reasonforisolation;
    public WebElement getreasonforisolation()  {
          return reasonforisolation;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-floppy-save'])")
    private WebElement save;
    public WebElement getsave()  {
          return save;
    } 
    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[1]")
    private WebElement startdate;
    public WebElement getstartdate()  {
          return startdate;
    }
    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[2]")
    private WebElement enddate;
    public WebElement getenddate()  {
          return enddate;
    }
    @FindBy(xpath = "(//span[.='Select Task Location(s)'])[1]")
    private WebElement tasklocations;
    public WebElement gettasklocations()  {
          return tasklocations;
    }
    @FindBy(xpath = "(//li[.='CP MOD 101-PT'])")
    private WebElement isolationlocation;
    public WebElement getisolationlocation()  {
          return isolationlocation;
    }
    @FindBy(xpath = "(//li[.='CP MOD 101 2nd Floor-PT'])")
    private WebElement worklocation;
    public WebElement getworklocation()  {
          return worklocation;
    }
    @FindBy(xpath = "(//span[.='Select'])[1]")
    private WebElement select;
    public WebElement getselect()  {
          return select;
    }
    @FindBy(xpath = "(//span[.='Select equipment'])[1]")
    private WebElement equipment;
    public WebElement getequipment()  {
          return equipment;
    }
    @FindBy(xpath = "(//input[@type='checkbox'][1])[5]")
    private WebElement equipmentcheckbox;
    public WebElement getequipmentcheckbox()  {
          return equipmentcheckbox;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-modal-confirm'])")
    private WebElement ok;
    public WebElement getok()  {
          return ok;
    }
    @FindBy(xpath = "(//textarea[@rows='3'][1])[2]")
    private WebElement drawingreference;
    public WebElement getdrawingreference()  {
          return drawingreference;
    }
    @FindBy(xpath = "(//textarea[@rows='3'][1])[3]")
    private WebElement zeroenergydemonstration;
    public WebElement getzeroenergydemonstration()  {
          return zeroenergydemonstration;
    }
    @FindBy(xpath = "(//span[.='Next'])")
    private WebElement next;
    public WebElement getnext()  {
          return next;
    }
    @FindBy(xpath = "(//span[.='Edit'])")
    private WebElement edit;
    public WebElement getedit()  {
          return edit;
    }
    @FindBy(xpath = "(//span[.='Add Isolation Point'])")
    private WebElement addisolationpoint;
    public WebElement getaddisolationpoint()  {
          return addisolationpoint;
    }
    @FindBy(xpath = "(//button[@class='eqp-node-expand-btn glyphicon glyphicon-plus'])[1]")
    private WebElement enterequipment;
    public WebElement getenterequipment()  {
          return enterequipment;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement enterequipmentcheckbox;
    public WebElement getenterequipmentcheckbox()  {
          return enterequipmentcheckbox;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    private WebElement enterequipmentcheckbox2;
    public WebElement getenterequipmentcheckbox2()  {
          return enterequipmentcheckbox2;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])[7]")
    private WebElement enterequipmentcheckbox3;
    public WebElement getenterequipmentcheckbox3()  {
          return enterequipmentcheckbox3;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-modal-confirm'])[1]")
    private WebElement enterequipmentok;
    public WebElement getenterequipmentok()  {
          return enterequipmentok;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn invalid btn-sm'])[1]")
    private WebElement isolationtype;
    public WebElement getisolationtype()  {
          return isolationtype;
    }
    @FindBy(xpath = "(//span[.='Mechanical'])")
    private WebElement mechanical;
    public WebElement getmechanical()  {
          return mechanical;
    }
    @FindBy(xpath = "(//span[.='Electrical'])")
    private WebElement electrical;
    public WebElement getelectrical()  {
          return electrical;
    }
    @FindBy(xpath = "(//span[.='Instrument'])")
    private WebElement instrument;
    public WebElement getinstrument()  {
          return instrument;
    }
    @FindBy(xpath = "(//span[.='Grounded (APP/RMV)'])")
    private WebElement groundedapprmv;
    public WebElement getgroundedapprmv()  {
          return groundedapprmv;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn invalid btn-sm'])[1]")
    private WebElement isolationmethod;
    public WebElement getisolationmethod()  {
          return isolationmethod;
    }
    @FindBy(xpath = "(//span[.='Locked (LO/CSO)'])")
    private WebElement lockedlocso;
    public WebElement getlockedlocso()  {
          return lockedlocso;
    } 
    @FindBy(xpath = "(//span[.='Locked (LO/CSC)'])")
    private WebElement Selectlockedlocso;
    public WebElement getSelectlockedlocso()  {
          return Selectlockedlocso;
    } 
    @FindBy(xpath = "(//span[.='SRA'])")
    private WebElement sra;
    public WebElement getsra()  {
          return sra;
    }    
    @FindBy(xpath = "(//textarea[@class='resizable-textarea form-control  input-sm'])")
    private WebElement isolationcomment;
    public WebElement getisolationcomment()  {
          return isolationcomment;
    }
    @FindBy(xpath = "//button[@aria-label='Save Instructions and Close'][1]")
    private WebElement isolationsaveandclose;
    public WebElement getisolationsaveandclose()  {
          return isolationsaveandclose;
    }
    @FindBy(xpath = "(//span[.='Attachments'])[1]")
    private WebElement isolationattachments;
    public WebElement getisolationattachments()  {
          return isolationattachments;
    }
    @FindBy(xpath = "(//button[@title='If you click this button a popup will appear where you can reference a file to attach.'])[1]")
    private WebElement isolationaddafile;
    public WebElement getisolationaddafile()  {
          return isolationaddafile;
    }
    @FindBy(xpath = "(//input[@placeholder='Filename'])[1]")
    private WebElement addafilefilename;
    public WebElement getaddafilefilename()  {
          return addafilefilename;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn '])[1]")
    private WebElement addafiletype;
    public WebElement getaddafiletype()  {
          return addafiletype;
    }
    @FindBy(xpath = "(//input[@placeholder='File path'])[1]")
    private WebElement addafilepath;
    public WebElement getaddafilepath()  {
          return addafilepath;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary okButton'])[1]")
    private WebElement addafileok;
    public WebElement getaddafileok()  {
          return addafileok;
    }
    @FindBy(xpath = "(//span[.='Action Page'])[1]")
    private WebElement actionpage;
    public WebElement getactionpage()  {
          return actionpage;
    }
    @FindBy(xpath = "(//span[.='Request Isolation by All Roles'])[1]")
    private WebElement requestisolationbyallroles;
    public WebElement getrequestisolationbyallroles()  {
          return requestisolationbyallroles;
    }
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement isolationyes;
    public WebElement getisolationyes()  {
          return isolationyes;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])[1]")
    private WebElement isolationsignaslogged;
    public WebElement getisolationsignaslogged()  {
          return isolationsignaslogged;
    }
    @FindBy(xpath = "(//h2[1]")
    private WebElement isolationh2;
    public WebElement getisolationh2()  {
          return isolationh2;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement continue2;
    public WebElement getcontinue2()  {
          return continue2;
    }   
    @FindBy(xpath = "(//div[@class='continue-message'])")
    private WebElement validationsuccessfully;
    public WebElement getvalidationsuccessfully()  {
          return validationsuccessfully;
    }  
}

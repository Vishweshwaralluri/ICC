package com.ICC.POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ApprovalLifecycleICC {
	public ApprovalLifecycleICC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[.='Permit Vision'][1])")
    private WebElement permitvision;    
	public WebElement getpermitvision()  {
          return permitvision;
    }
    @FindBy(xpath = "(//span[.='Permit to Work'])")
    private WebElement permittowork;
    public WebElement getpermittowork()  {
          return permittowork;         
    }
    @FindBy(xpath = "(//span[.='Request'][1])")
    private WebElement request;
    public WebElement getrequest()  {
          return request;
    }
    @FindBy(xpath = "(//span[.='Permit to Work'])[2]")
    private WebElement createnewpermittowork;
    public WebElement getcreatenewpermittowork()  {
          return createnewpermittowork;         
    }
   	@FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[1]")
    private WebElement typelist;
    public WebElement gettypelist()  {
          return typelist;  
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'][1])[2]")
    private WebElement category;
    public WebElement getcategory()  {
          return category;         
    }
    @FindBy(xpath = "(//input[@type='text'][1])[1]")
    private WebElement title;
    public WebElement gettitle()  {
          return title;         
    }
    @FindBy(xpath = "(//textarea[@data-testid='resizable-textarea-input'])")
    private WebElement descriptiondetails;
    public WebElement getdescriptiondetails()  {
          return descriptiondetails;         
    }
    @FindBy(xpath = "(//input[@id='val_LSAInvolved_Yes'])")
    private WebElement workactivityinvolve;
    public WebElement getworkactivityinvolve()  {
          return workactivityinvolve;         
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[1]")
    private WebElement typelist1;
    public WebElement gettypelist1()  {
          return typelist1;         
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[2]")
    private WebElement typelist2;
    public WebElement gettypelist2()  {
          return typelist2;         
    }    		
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn '])")
    private WebElement typelist3;
    public WebElement gettypelist3()  {
          return typelist3;         
    }    		
    @FindBy(xpath = "(//li[@data-value='Critical'])")
    private WebElement critical;
    public WebElement getcritical()  {
          return critical;         
    }
    @FindBy(xpath = "(//li[@data-value='BreakingContainment'])")
    private WebElement breakingcontainment;
    public WebElement getbreakingcontainment()  {
          return breakingcontainment;         
    }
    @FindBy(xpath = "(//span[.='Instrument'])")
    private WebElement instrument;
    public WebElement getinstrument()  {
          return instrument;         
    }
    @FindBy(xpath = "(//div[@class='react-datepicker__day react-datepicker__day--tue react-datepicker__day--today'])")
    private WebElement dayselect;
    public WebElement getdayselect()  {
          return dayselect;         
    }
    @FindBy(xpath = "(//div[@class='react-datepicker__day react-datepicker__day--wed'])")
    private WebElement enddayselect;
    public WebElement getenddayselect()  {
          return enddayselect;         
    }
    @FindBy(xpath = "(//input[@value='LifeSavingActions_BreakingContainment'])")
    private WebElement lifesavingaction;
    public WebElement getlifesavingaction()  {
          return lifesavingaction;         
    }
    @FindBy(xpath = "(//input[@value='SWPDocuments_BreakingContainment'])")
    private WebElement swpchecklist;
    public WebElement getswpchecklist()  {
          return swpchecklist;         
    }
    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[1]")
    private WebElement startdate;
    public WebElement getstartdate()  {
          return startdate;
    }
    @FindBy(xpath = "(//div[@class='react-datepicker__month']//div[not(contains(@class,'react-datepicker__day--outside-month'))]/div[text()=3)")
    private WebElement startdateclick;
    public WebElement getstartdateclick()  {
          return startdateclick;
    }
    @FindBy(xpath = "(//span[@class='timepicker-cell'][4])[12]")
    private WebElement starttimepicker;
    public WebElement getstarttimepicker()  {
          return starttimepicker;
    }
    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[2]")
    private WebElement enddate;
    public WebElement getenddate()  {
          return enddate;
    }
    @FindBy(xpath = "(//input[@class='form-control'][1])[3]")
    private WebElement starttime;
    public WebElement getstarttime()  {
    return starttime;
    }
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    private WebElement inputstarttime;
    public WebElement getinputstarttime()  {
    return inputstarttime;
    }
    @FindBy(xpath = "(//span[.='Select Task Location(s)'])")
    private WebElement tasklocation;
    public WebElement gettasklocation()  {
    return tasklocation;
    }
    @FindBy(xpath = "(//li[@title='CP MOD 103-PT'])")
    private WebElement sitelocation;
    public WebElement getsitelocation()  {
    return sitelocation;
    }
    @FindBy(xpath = "(//li[@title='CP MOD 103 Mezzanines LER-PT'])")
    private WebElement sitelocation2;
    public WebElement getsitelocation2()  {
    return sitelocation2;
    }
    @FindBy(xpath = "(//span[.='Select'])")
    private WebElement buttonselect;
    public WebElement getbuttonselect()  {
    return buttonselect;
    }
    @FindBy(xpath = "(//span[.='Select equipment'])")
    private WebElement selectequipment;
    public WebElement getselectequipment()  {
    return selectequipment;
    }
    @FindBy(xpath = "(//button[@class='eqp-node-expand-btn glyphicon glyphicon-plus'])[1]")
    private WebElement plusclick;
    public WebElement getplusclick()  {
    return plusclick;
    }
    @FindBy(xpath = "(//span[@class='eqp-node-text eqp-node-formatted-text'])[2]")
    private WebElement nodecheck;
    public WebElement getnodecheck()  {
    return nodecheck;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-modal-confirm'])")
    private WebElement clickok;
    public WebElement getclickok()  {
    return clickok;
    }
    @FindBy(xpath = "(//input[@data-testid='numberOfPersonsField'])")
    private WebElement numberofpeople;
    public WebElement getnumberofpeople()  {
    return numberofpeople;
    }
    @FindBy(xpath = "(//input[@id='workOrderNumberField'])")
    private WebElement workordernumber;
    public WebElement getworkordernumber()  {
    return workordernumber;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn '])")
    private WebElement leaddiscipline;
    public WebElement getleaddiscipline()  {
    return leaddiscipline;
    }
    @FindBy(xpath = "(//input[@name='isolationCertificateRequirement'])[1]")
    private WebElement isolationtypeicc;
    public WebElement getisolationtypeicc()  {
    return isolationtypeicc;
    }
    @FindBy(xpath = "(//button[@class='dropdown-toggle btn invalid btn-sm'])[1]")
    private WebElement isolationtype;
    public WebElement getisolationtype()  {
    return isolationtype;
    }
    @FindBy(xpath = "(//span[.='Next'])")
    private WebElement clicknext;
    public WebElement getclicknext()  {
    return clicknext;
    }
    @FindBy(xpath = "(//input[@id='val_JSARequirement_External'])")
    private WebElement jsatype;
    public WebElement getjsatype()  {
    return jsatype;
    }
    @FindBy(xpath = "(//input[@value='PermitPackDocuments_AtmosphericTestRecord'])")
    private WebElement prrmitpackdoc;
    public WebElement getprrmitpackdoc()  {
    return prrmitpackdoc;
    }
    @FindBy(xpath = "(//span[.='Request Permit by All Roles'])")
    private WebElement requestpermitby;
    public WebElement getrequestpermitby()  {
    return requestpermitby;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement signasloggedin;
    public WebElement getsignasloggedin()  {
    return signasloggedin;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement clickheretocontinue;
    public WebElement getclickheretocontinue()  {
    return clickheretocontinue;
    }
    @FindBy(xpath = "(//span[.='Attachments'])")
    private WebElement attachments;
    public WebElement getattachments()  {
    return attachments;
    }
    @FindBy(xpath = "(//button[@class='btn-link btnAddAttachment file'])")
    private WebElement addtofile;
    public WebElement getaddtofile()  {
    return addtofile;
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
    @FindBy(xpath = "(//span[.='External JSA'])")
    private WebElement ExternalJSA;
    public WebElement getExternalJSA()  {
          return ExternalJSA;
    }
    @FindBy(xpath = "(//span[.='SRA'])")
    private WebElement sra;
    public WebElement getsra()  {
          return sra;
    } 
    @FindBy(xpath = "(//input[@value='upload'])")
    private WebElement typrofupload;
    public WebElement gettyprofupload()  {
          return typrofupload;
    }
    @FindBy(xpath = "(//input[@type='file'])")
    private WebElement dragfilehere;
    public WebElement getdragfilehere()  {
          return dragfilehere;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement actionpage;
    public WebElement getactionpage()  {
          return actionpage;
    }
    @FindBy(xpath = "(//span[.='Details'])")
    private WebElement details;
    public WebElement getdetails()  {
          return details;
    }
    @FindBy(xpath = "(//button[@id='wizardStep4Button'])")
    private WebElement wizardstep4;
    public WebElement getwizardstep4()  {
          return wizardstep4;
    }
    @FindBy(xpath = "(//span[.='Review Permit by AA/AAF'])")
    private WebElement reviewpermitbyaaaaf;
    public WebElement getreviewpermitbyaaaaf()  {
          return reviewpermitbyaaaaf;
    }
    @FindBy(xpath = "(//span[.='Archive Isolation Certificate by AA/AAF'])")
    private WebElement archiveisolationcertificatebyaaaaf;
    public WebElement getarchiveisolationcertificatebyaaaaf()  {
          return archiveisolationcertificatebyaaaaf;
    }
    @FindBy(xpath = "(//span[.='Review Permit by AA/AAF'])")
    private WebElement reviewpermitbyaaaf;
    public WebElement getreviewpermitbyaaaf()  {
          return reviewpermitbyaaaf;
    }
    @FindBy(xpath = "(//span[.='Review Permit by AA/AAF'])")
    private WebElement textvalidationaaaaf;
    public WebElement gettextvalidationaaaaf()  {
          return textvalidationaaaaf;
    }       
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement aaaafsignasloggedin;
    public WebElement getaaaafsignasloggedin()  {
          return aaaafsignasloggedin;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement aaaafclickheretocontinue;
    public WebElement getaaaafclickheretocontinue()  {
          return aaaafclickheretocontinue;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement headerimagevalidation;
    public WebElement getheaderimagevalidation()  {
          return headerimagevalidation;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement picactionpage;
    public WebElement getpicactionpage()  {
          return picactionpage;
    }
    @FindBy(xpath = "(//span[.='Endorse Permit by PIC'])")
    private WebElement endorsepermitbypic;
    public WebElement getendorsepermitbypic()  {
          return endorsepermitbypic;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement picsignasloggedin;
    public WebElement getpicsignasloggedin()  {
          return picsignasloggedin;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])[2]")
    private WebElement picsiaaaafsignaslogged;
    public WebElement getpicsiaaaafsignaslogged()  {
          return picsiaaaafsignaslogged;
    }
    @FindBy(xpath = "(//span[.='Click here to continue'])")
    private WebElement picclickheretocontinue;
    public WebElement getpicclickheretocontinue()  {
          return picclickheretocontinue;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement imgevalidation;
    public WebElement getimgevalidation()  {
          return imgevalidation;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement aaactionpage;
    public WebElement getaaactionpage()  {
          return aaactionpage;
    }
    @FindBy(xpath = "(//span[.='Authorize Permit by AA'])")
    private WebElement authorizepermitbyaa;
    public WebElement getauthorizepermitbyaa()  {
          return authorizepermitbyaa;
    }
    @FindBy(xpath = "(//span[.='Reauthorize Permit by AA'])")
    private WebElement reauthorizepermitbyaa;
    public WebElement getreauthorizepermitbyaa()  {
          return reauthorizepermitbyaa;
    }
    @FindBy(xpath = "(//span[.='An ICC or RFIC must be attached before proceeding.'])")
    private WebElement beforeproceeding;
    public WebElement getbeforeproceeding()  {
          return beforeproceeding;
    }
    @FindBy(xpath = "(//span[.='Attachments'])")
    private WebElement aaattachments;
    public WebElement getaaattachments()  {
    return aaattachments;
    }    
    @FindBy(xpath = "(//button[@class='btn-link btnAddAttachment isolationCertificate'])")
    private WebElement addisolationCertificate;
    public WebElement getaddisolationCertificate()  {
          return addisolationCertificate;
    }
    @FindBy(xpath = "(//li[@class='certificates-list-item'])[1]")
    private WebElement certificatesitem;
    public WebElement getcertificatesitem()  {
          return certificatesitem;
    }
    @FindBy(xpath = "(//div[@class='menu-btn-icon icon-attachments-isolation-new'])")
    private WebElement iconnewisolation;
    public WebElement geticonnewisolation()  {
          return iconnewisolation;
    }
    @FindBy(xpath = "(//div[@class='menu-btn menu-btn-primary'])[1]")
    private WebElement newisolation;
    public WebElement getnewisolation()  {
          return newisolation;
    }
    @FindBy(xpath = "(//textarea[@rows='3'][1])[1]")
    private WebElement reasonforisolation;
    public WebElement getreasonforisolation()  {
          return reasonforisolation;
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
    @FindBy(xpath = "(//input[@type='checkbox'])[18]")
    private WebElement enterequipmentcheckbox4;
    public WebElement getenterequipmentcheckbox4()  {
          return enterequipmentcheckbox4;
    } 
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-modal-confirm'])[1]")
    private WebElement enterequipmentok;
    public WebElement getenterequipmentok()  {
          return enterequipmentok;
    }
    @FindBy(xpath = "(//span[.='Mechanical'])")
    private WebElement mechanical;
    public WebElement getmechanical()  {
          return mechanical;
    }
    @FindBy(xpath = "(//span[.='Mechanical'])[3]")
    private WebElement mechanical3;
    public WebElement getmechanical3()  {
          return mechanical3;
    }
    @FindBy(xpath = "(//span[.='Electrical'])")
    private WebElement electrical;
    public WebElement getelectrical()  {
          return electrical;
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
    @FindBy(xpath = "(//span[.='Locked (LO/CSO)'])[3]")
    private WebElement lockedlocso3;
    public WebElement getlockedlocso3()  {
    return lockedlocso3;
    }
   @FindBy(xpath = "(//span[.='Locked (LO/CSC)'])")
    private WebElement Selectlockedlocso;
    public WebElement getSelectlockedlocso()  {
          return Selectlockedlocso;
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
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-floppy-save'])")
    private WebElement save;
    public WebElement getsave()  {
          return save;
    } 
    @FindBy(xpath = "(//button[@id='closeCertificateButton'])")
    private WebElement newisolationcloseCertificate;
    public WebElement getnewisolationcloseCertificate()  {
          return newisolationcloseCertificate;
    }
    @FindBy(xpath = "closeCertificateyes")
    private WebElement closeCertificateyes;
    public WebElement getcloseCertificateyes()  {
          return closeCertificateyes;
    }
    @FindBy(xpath = "(//div[@class='menu-btn-icon icon-attachments-isolation-existing'])")
    private WebElement isolationexisting;
    public WebElement getisolationexisting()  {
          return isolationexisting;
    }
    @FindBy(xpath = "(//img[@class='media-object cert-icon-img'])[11]")
    private WebElement existingcertificates;
    public WebElement getexistingcertificates()  {
          return existingcertificates;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])")
    private WebElement authorizepermitbyaasignaslogin;
    public WebElement getauthorizepermitbyaasignaslogin()  {
          return authorizepermitbyaasignaslogin;
    }
    @FindBy(xpath = "(//span[.='Request Isolation by All Roles'])")
    private WebElement requestisolationbyallroles;
    public WebElement getrequestisolationbyallroles()  {
          return requestisolationbyallroles;
    }
    @FindBy(xpath = "(//span[.='Issue Permit by AO'])")
    private WebElement issuepermitbyao;
    public WebElement getissuepermitbyao()  {
          return issuepermitbyao;
    }
    @FindBy(xpath = "(//span[.='Reissue Permit by AO'])")
    private WebElement reissuepermitbyao;
    public WebElement getreissuepermitbyao()  {
          return reissuepermitbyao;
    }
    @FindBy(xpath = "(//span[.='Reauthorize Permit by AA'])")
    private WebElement Reauthorizeperimitbyaa;
    public WebElement getReauthorizeperimitbyaa()  {
          return Reauthorizeperimitbyaa;
    }
    @FindBy(xpath = "(//li[@class='validation-error validation-error-Rule_AttachedCertificateMustHaveCorrectState'])[1]")
    private WebElement errormessageiccnotrequired;
    public WebElement geterrormessageiccnotrequired()  {
          return errormessageiccnotrequired;
    }
    @FindBy(xpath = "(//span[@class='openCertificateAttachment'])")
    private WebElement openiccanotherwindow;
    public WebElement getopeniccanotherwindow()  {
          return openiccanotherwindow;
    }
    @FindBy(xpath = "(//span[.='Action Page'])")
    private WebElement openwindowactionpage;
    public WebElement getopenwindowactionpage()  {
          return openwindowactionpage;
    }
    @FindBy(xpath = "(//button[@id='closeCertificateButton'])")
    private WebElement openiccwindowclose;
    public WebElement getopeniccwindowclose()  {
          return openiccwindowclose;
    }
    @FindBy(xpath = "(//button[@class='btn btn-primary pull-right sign-button sign-button-AcceptPermit'])")
    private WebElement issuepermitaosign;
    public WebElement getissuepermitaosign()  {
          return issuepermitaosign;
    }
    @FindBy(xpath = "(//span[.='Isolation in Progress'])")
    private WebElement isolationinProgress;
    public WebElement getisolationinProgress()  {
          return isolationinProgress;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-refresh'])")
    private WebElement isolationrefresh;
    public WebElement getisolationrefresh()  {
          return isolationrefresh;
    }
    @FindBy(xpath = "(//input[@class='form-control'])")
    private WebElement datefrom;
    public WebElement getdatefrom()  {
          return datefrom;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-time'])")
    private WebElement timefrom;
    public WebElement gettimefrom()  {
          return timefrom;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement Iimage;
    public WebElement getIimage()  {
          return Iimage;
    }
    @FindBy(xpath = "(//span[.='Verify Plan by AA/AAF'])")
    private WebElement verifyplanbyAAAAF;
    public WebElement getverifyplanbyAAAAF()  {
          return verifyplanbyAAAAF;
    }
    @FindBy(xpath = "(//span[.='Perform Isolation by AA/AO'])")
    private WebElement performisolationbyaaao;
    public WebElement getperformisolationbyaaao()  {
          return performisolationbyaaao;
    }
    @FindBy(xpath = "(//span[.='Confirm Isolation by AO'])")
    private WebElement confirmisolationbyao;
    public WebElement getconfirmisolationbyao()  {
          return confirmisolationbyao;
    }
    @FindBy(xpath = "(//span[.='Accept Permit by PH'])")
    private WebElement acceptpermitbyph;
    public WebElement getacceptpermitbyph()  {
          return acceptpermitbyph;
    }
    @FindBy(xpath = "(//span[.='Reaccept Permit by PH'])")
    private WebElement reacceptpermitbyph;
    public WebElement getreacceptpermitbyph()  {
          return reacceptpermitbyph;
    }
    @FindBy(xpath = "(//span[.='Sign'])[1]")
    private WebElement phsign;
    public WebElement getphsign()  {
          return phsign;
    }
    @FindBy(xpath = "(//span[.='Sign'])[2]")
    private WebElement sign;
    public WebElement getsign()  {
          return sign;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])[1]")
    private WebElement phsignasloggedin1;
    public WebElement getphsignasloggedin1()  {
          return phsignasloggedin1;
    }
    @FindBy(xpath = "(//span[.='Suspend / Suspend for Test by AA/AAF/AO/PH'])")
    private WebElement suspendtestAAAAFAOPH;
    public WebElement getsuspendtestAAAAFAOPH()  {
          return suspendtestAAAAFAOPH;
    }
    @FindBy(xpath = "(//span[.='Archive Permit by AA/AAF/PC/Site Administrator'])")
    private WebElement archivepermitbyaaaafpcsiteadmin;
    public WebElement getarchivepermitbyaaaafpcsiteadmin()  {
          return archivepermitbyaaaafpcsiteadmin;
    }
    @FindBy(xpath = "(//span[.='Amend Isolation by IA/AO'])")
    private WebElement amendisolationbyiaao;
    public WebElement getamendisolationbyiaao()  {
          return amendisolationbyiaao;
    }
    @FindBy(xpath = "(//span[.='Sign as logged in'])[1]")
    private WebElement phsignasloggedin;
    public WebElement getphsignasloggedin()  {
          return phsignasloggedin1;
    }
    @FindBy(xpath = "(//img[@class='certificate-image'])")
    private WebElement Simage;
    public WebElement getSimage()  {
          return Simage;
    }
    @FindBy(xpath = "(//span[.='Amend Isolation by IA/AO'])")
    private WebElement ameendisolationbyiaao;
    public WebElement getameendisolationbyiaao()  {
          return ameendisolationbyiaao;
    }
    @FindBy(xpath = "(//textarea[@id='remarksfield'])[1]")
    private WebElement remarksfield;
    public WebElement getremarksfield()  {
          return remarksfield;
    }
    @FindBy(xpath = "(//button[@id='printCertificateButton'])[1]")
    private WebElement print1;
    public WebElement getprint1()  {
          return print1;
    }
    @FindBy(xpath = "(//span[.='Reauthorize Permit by AA'])")
    private WebElement permitbyaa;
    public WebElement getpermitbyaa()  {
          return permitbyaa;
    }
    @FindBy(xpath = "(//span[.='Perform De-isolation by AA/AO'])")
    private WebElement deisolationbyaaao;
    public WebElement getdeisolationbyaaao()  {
          return deisolationbyaaao;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement allcheckbox;
    public WebElement getallcheckbox()  {
          return allcheckbox;
    }
    @FindBy(xpath = "(//span[.='Attached to certificate(s) in incorrect state.'])")
    private WebElement errormessaged;
    public WebElement geterrormessaged()  {
          return errormessaged;
    }
    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-remove'])")
    private WebElement closepopup;
    public WebElement getclosepopup()  {
          return closepopup;
    }
    @FindBy(xpath = "(//span[.='Job Complete / Incomplete by PH/AO'])")
    private WebElement jobcompletephao;
    public WebElement getjobcompletephao()  {
          return jobcompletephao;
    }
    @FindBy(xpath = "(//input[@id='val_WorkStatusField_JobComplete'])")
    private WebElement WorkStatusField;
    public WebElement getWorkStatusField()  {
          return WorkStatusField;
    }
    @FindBy(xpath = "(//span[.='PTW Complete by AO'])")
    private WebElement ptwcompletebyao;
    public WebElement getptwcompletebyao()  {
          return ptwcompletebyao;
    }
    @FindBy(xpath = "(//li[@class='validation-error validation-error-Rule_AttachedCertificateMustHaveCorrectState']")
    private WebElement ptwcompletebyaoerror;
    public WebElement getptwcompletebyaoerror()  {
          return ptwcompletebyaoerror;
    }
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement checkboxdeiso;
    public WebElement getcheckboxdeiso()  {
          return checkboxdeiso;
    }
    @FindBy(xpath = "(//span[.='Update Point Position by IA'])")
    private WebElement updatepointia;
    public WebElement getupdatepointia()  {
          return updatepointia;
    }
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement lockno;
    public WebElement getlockno()  {
          return lockno;
    }
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    private WebElement lockno1;
    public WebElement getlockno1()  {
          return lockno1;
    }
    @FindBy(xpath = "(//span[.='Confirm De-isolation by AO'])")
    private WebElement confirmdeisolationbyao;
    public WebElement getconfirmdeisolationbyao()  {
          return confirmdeisolationbyao;
    }
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private WebElement radiodeisobyao;
    public WebElement getradiodeisobyao()  {
          return radiodeisobyao;
    }
    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement radio3;
    public WebElement getradio3()  {
    return radio3;
    }    		
    @FindBy(xpath = "(//button[@class='btn btn-link'])")
    private WebElement refresh;
    public WebElement getrefresh()  {
          return refresh;
    }
    @FindBy(xpath = "(//span[.='PTW Complete by AO'])")
    private WebElement ptwcompletedbyao;
    public WebElement getptwcompletedbyao()  {
          return ptwcompletedbyao;
    }
    @FindBy(xpath = "(//input[@type='radio'])[3]")
    private WebElement radiodeisobyao1;
    public WebElement getradiodeisobyao1()  {
          return radiodeisobyao1;
    }
    @FindBy(xpath = "(//span[.='Cancel'])")
    private WebElement cancel;
    public WebElement getcancel()  {
          return cancel;
    }
    @FindBy(xpath = "(//button[@id='wizardStep4Button'])")
    private WebElement wizardstep4button;
    public WebElement getwizardstep4button()  {
          return wizardstep4button;
    }
    @FindBy(xpath = "(//button[@id='wizardStep2Button'])")
    private WebElement wizardstep2button;
    public WebElement getwizardstep2button()  {
          return wizardstep2button;
    }
    @FindBy(xpath = "(//input[@type='text'])")
    private WebElement IsolationControlPoints;
    public WebElement getIsolationControlPoints()  {
          return IsolationControlPoints;
    }
}

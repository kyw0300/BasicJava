package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoController {
	private MemoService service = new MemoService();
	private MemoView view = new MemoView();
	
	public void selectMemos(String searchWord) throws Exception {
		List<MemoVO> list = service.selectMemos(searchWord);
		view.printMemos(list);
	}
	
	public void selectMemo(Scanner scanner) throws Exception {
		int searchNo = view.inputSearchNo(scanner);
		MemoVO memo = service.selectMemo(searchNo);
		view.printMemo(memo);
	}
	
	public void insertMemo(Scanner scanner) throws Exception {
		MemoVO vo = view.inoutInsertMemo(scanner);
		int insertMemo = service.insertMemo(vo);
		view.insertResult(insertMemo);
	}
	
	public void updateMemo(Scanner scanner) throws Exception {
		//int updateNum = view.inputUpdateNum(scanner);
		MemoVO vo = view.inputUpdateMemo(scanner);
		int unum = service.updateMemo(vo);
		view.updateResult(unum);
	}
	
	public void deleteMemo(Scanner scanner) throws Exception {
		int deleteNum = view.inputDeleteNum(scanner);
		int dnum = service.deleteMemo(deleteNum);
		view.deleteResult(dnum);
	}
}

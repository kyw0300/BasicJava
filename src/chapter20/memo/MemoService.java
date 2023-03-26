package chapter20.memo;

import java.util.List;

public class MemoService {
	private MemoDAO dao = new MemoDAO();
	
	public List<MemoVO> selectMemos(String searchWord) throws Exception {
		List<MemoVO> list = dao.selectMemos(searchWord);
		return list; //return dao.selectMemos(searchWord);
	}
	
	public MemoVO selectMemo(int searchNo) throws Exception {
		return dao.selectMemo(searchNo);
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
	
	public int deleteMemo(int deleteNo) throws Exception {
		return dao.deleteMemo(deleteNo);
	}
}
